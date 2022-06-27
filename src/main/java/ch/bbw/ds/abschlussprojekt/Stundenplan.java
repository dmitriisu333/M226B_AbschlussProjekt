package ch.bbw.ds.abschlussprojekt;

import java.util.ArrayList;

public class Stundenplan {

    private ArrayList<Lektion> lektionen;

    public Stundenplan(){
        lektionen = new ArrayList<>();
    }

    public void addLektion (Lektion l){
        lektionen.add(l);
    }



}
