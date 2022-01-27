package com.example.webapprest.service.menü;

import com.example.webapprest.bean.Config;
import com.example.webapprest.bean.Kunden;
import com.example.webapprest.service.menü.inter.KundenServiceInter;

import java.util.List;

public class KundenService implements KundenServiceInter {

    Config config = Config.instance();

    @Override
    public void addKunden(Kunden kunden) {
        config.getKundens().add(kunden);
    }

    @Override
    public List<Kunden> getAllKunden() {
        return config.getKundens();
    }

    @Override
    public void updateKunden(int index, Kunden kunden) {
        config.getKundens().set(index, kunden);
    }

}
