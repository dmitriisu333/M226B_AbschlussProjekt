package ch.bbw.ds.abschlussprojekt;

public class Lektion {
    private Long lektionID;
    private int dauer;
    private Modul modul;
    private Lernzimmer lernzimmer;

    public Lektion(long lektionID, int dauer, Modul modul, Lernzimmer lernzimmer) {
        this.lektionID = lektionID;
        this.dauer = dauer;
        this.modul = modul;
        this.lernzimmer = lernzimmer;
    }


    public Long getLektionID() {
        return lektionID;
    }

    public Modul getModul() {
        return modul;
    }


    public Lernzimmer getLernzimmer() {
        return lernzimmer;
    }

    public void setLernzimmer(Lernzimmer lernzimmer) {
        this.lernzimmer = lernzimmer;
    }

    public void setLektionID(Long lektionID) {
        this.lektionID = lektionID;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    @Override
    public String toString() {
        return "Lektion{" +
                "lektionID=" + lektionID +
                ", dauer=" + dauer +
                ", modul=" + modul +
                ", lernzimmer=" + lernzimmer +
                '}';
    }
}
