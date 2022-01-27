package com.example.webapprest;

import com.example.webapprest.bean.Kunden;
import com.example.webapprest.service.menü.KundenService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "controllerServlet", value = "/cs")
public class ControllerServlet extends HttpServlet {

    private KundenService service = new KundenService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        String action = request.getParameter("action");

        if (action.equals("getAllKunden")){
            List<Kunden> kundens = service.getAllKunden();
            Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
            response.getOutputStream().println(gson.toJson(kundens));

        } else {
            response.getOutputStream().println("{}");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");

        try {

            String action = req.getParameter("action");

            if (action.equals("addKunden")) {

                String requestBody = getBody(req);
                Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
                Kunden kunden = gson.fromJson(requestBody, Kunden.class);

                service.addKunden(kunden);

            }
            if (action.equals("updateKunden")){
                int index = Integer.parseInt(req.getParameter("id"));

                String requestBody = getBody(req);
                Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
                Kunden kunden = gson.fromJson(requestBody, Kunden.class);

                service.updateKunden(index, kunden);


            }
            if(action.equals("delete")){
                int index = Integer.parseInt(req.getParameter("id"));

                service.delete(index);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getBody(HttpServletRequest request) throws IOException {

        String body = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }

        body = stringBuilder.toString();
        return body;
    }

}