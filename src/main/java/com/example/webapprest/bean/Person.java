package com.example.webapprest.bean;

import com.example.webapprest.bean.types.Geschlecht;
import com.example.webapprest.bean.types.Titel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
   private String nachName;
   private String vorName;
   private Date geburtsDatum;
   private Geschlecht geschlecht;
   private Titel titel;

   public Person() {
   }

   public String getNachName() {
      return nachName;
   }

   public void setNachName(String nachName) {
      this.nachName = nachName;
   }

   public String getVorName() {
      return vorName;
   }

   public void setVorName(String vorName) {
      this.vorName = vorName;
   }

   public Date getGeburtsDatum() {
      return geburtsDatum;
   }

   public void setGeburtsDatum(Date geburtsDatum) {
      this.geburtsDatum = geburtsDatum;
   }

   public Geschlecht getGeschlecht() {
      return geschlecht;
   }

   public void setGeschlecht(Geschlecht geschlecht) {
      this.geschlecht = geschlecht;
   }

   public Titel getTitel() {
      return titel;
   }

   public void setTitel(Titel titel) {
      this.titel = titel;
   }
}



