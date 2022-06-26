package ch.bbw.ds.abschlussprojekt;

import java.util.ArrayList;
import java.util.Collections;

public class Klasse {
    private Long klasseID;
    private String klasseName;
    private int klasseNummer;
    private ArrayList<Student> liste;
    private Lehrer klassenlehrer;
    public Klasse(Long klasseID, String klasseName, int klasseNummer, Student s, Lehrer l){
        this.klasseID = klasseID;
        this.klasseName = klasseName;
        this.klasseNummer = klasseNummer;
        this.liste = new ArrayList<>();
        Collections.addAll(this.liste, s);
        this.klassenlehrer = l;
    }

    public void addStudent (Student s) {
        this.liste.add(s);
    }

    public Long getKlasseID() {
        return klasseID;
    }

    public void setKlasseID(Long klasseID) {
        this.klasseID = klasseID;
    }

    public String getKlasseName() {
        return klasseName;
    }

    public void setKlasseName(String klasseName) {
        this.klasseName = klasseName;
    }

    public int getKlasseNummer() {
        return klasseNummer;
    }

    public void setKlasseNummer(int klasseNummer) {
        this.klasseNummer = klasseNummer;
    }

    public ArrayList<Student> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Student> liste) {
        this.liste = liste;
    }

    public Lehrer getKlassenlehrer() {
        return klassenlehrer;
    }

    public void setKlassenlehrer(Lehrer klassenlehrer) {
        this.klassenlehrer = klassenlehrer;
    }
}
