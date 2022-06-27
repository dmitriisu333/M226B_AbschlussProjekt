package ch.bbw.ds.abschlussprojekt;

import java.util.ArrayList;
import java.util.Collections;

public class Klasse {
    private Long klasseID;
    private String klasseName;
    private int klasseNummer;
    private ArrayList<Student> studentListe;
    private Lehrer klassenlehrer;
    private int capacity;
    private ArrayList<Lektion> stundenplan;
    int stundenplanCapacity = 6;

    public Klasse(Long klasseID, String klasseName, int klasseNummer, Lehrer l, int maxNumberOfStudents){
        this.klasseID = klasseID;
        this.klasseName = klasseName;
        this.klasseNummer = klasseNummer;
        this.klassenlehrer = l;
        this.studentListe = new ArrayList<>();
        capacity = maxNumberOfStudents;
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
            System.out.println("Diese Klasse ist voll");
        }
    }


    public void addStudent (Student s) {
        try {
            if (studentListe.size() == capacity) {
                throw new AbschlussprojektException();
            } else {
                this.studentListe.add(s);
            }
        } catch (AbschlussprojektException e) {
            System.out.println("Eine Klasse kann nicht mehr als 8 Lektionen haben");
        }
    }

    public void removeStudent(Student s){
        try {
            if (this.studentListe.size() > 1) {
                this.studentListe.remove(s);
            } else {
                throw new AbschlussprojektException();
            }
        } catch (AbschlussprojektException e) {
            System.out.println("Es muss mindestens ein Student in die Klasse bleiben");
        }
    }

    public void printStundenplan(){
        //soll mehr lesbar sein
        System.out.println(stundenplan);
    }

    public ArrayList<Student> getStudentListe() {
        return studentListe;
    }

    public void setStudentListe(ArrayList<Student> studentListe) {
        this.studentListe = studentListe;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Lektion> getStundenplan() {
        return stundenplan;
    }

    public void setStundenplan(ArrayList<Lektion> stundenplan) {
        this.stundenplan = stundenplan;
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
        return studentListe;
    }

    public void setListe(ArrayList<Student> liste) {
        this.studentListe = liste;
    }

    public Lehrer getKlassenlehrer() {
        return klassenlehrer;
    }

    public void setKlassenlehrer(Lehrer klassenlehrer) {
        this.klassenlehrer = klassenlehrer;
    }

    @Override
    public String toString() {
        return "Klasse{" +
                "klasseID=" + klasseID +
                ", klasseName='" + klasseName + '\'' +
                ", klasseNummer=" + klasseNummer +
                ", studentListe=" + studentListe +
                ", klassenlehrer=" + klassenlehrer +
                ", capacity=" + capacity +
                '}';
    }
}
