package com.example.webapprest.service.menü.inter;

import com.example.webapprest.bean.Kunden;

import java.util.List;

public interface KundenServiceInter {
    void addKunden(Kunden kunden);
    List<Kunden> getAllKunden();
    void updateKunden(int index, Kunden kunden);
}
