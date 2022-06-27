package ch.bbw.ds.abschlussprojekt;

import java.util.ArrayList;
import java.util.Collections;

public class Lehrer extends Person {
    private int lohn;
    private int lohnVerdient;
    private ArrayList<Lektion> stundenplan;
    int stundenplanCapacity = 8;
    public Lehrer(Long id, String name, String vorname, int alter,
                  String geschlecht, String email, String telefonnummer,
                  Addresse adresse, int lohn) {
        super(id, name, vorname, alter, geschlecht, email, telefonnummer, adresse);
        this.lohn = lohn;
        this.lohnVerdient = 0;
        this.stundenplan = new ArrayList<>();
    }

    public void addLektion (Lektion l) {
        try {
            if (stundenplan.size() == stundenplanCapacity) {
                throw new AbschlussprojektException();
            } else {
                this.stundenplan.add(l);
            }
        } catch (AbschlussprojektException e) {
            System.out.println("Ein Lehrer kann nicht mehr als 8 Lektionen haben");
        }
    }

    public void printStundenplan(){
        //soll mehr lesbar sein
        System.out.println(stundenplan);
    }

    public void lohnBekommen(int lohn) {
        lohnVerdient += lohn;
    }

    public int getLohn() {
        return lohn;
    }

    public void setLohn(int lohn) {
        this.lohn = lohn;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVorname() {
        return vorname;
    }

    @Override
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public int getAlter() {
        return alter;
    }

    @Override
    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String getGeschlecht() {
        return geschlecht;
    }

    @Override
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelefonnummer() {
        return telefonnummer;
    }

    @Override
    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public Addresse getAdresse() {
        return adresse;
    }

    @Override
    public void setAdresse(Addresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Lehrer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", alter=" + alter +
                ", geschlecht='" + geschlecht + '\'' +
                ", email='" + email + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", adresse=" + adresse +
                ", lohn=" + lohn +
                ", lohnVerdient=" + lohnVerdient
                + '}'
                ;
    }

}
