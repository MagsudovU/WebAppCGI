package com.example.webapprest.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Config implements Serializable {
    private static Config config = null;
    private List<Kunden> kundens = new ArrayList<>();

    public List<Kunden> getKundens() {
        return kundens;
    }

    public static Config instance(){
        if(config == null){
            config = new Config();
        }
        return config;
    }
    private Config(){

    }


}
