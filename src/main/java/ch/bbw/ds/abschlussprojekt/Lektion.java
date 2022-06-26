package ch.bbw.ds.abschlussprojekt;

public class Lektion {
    private Long lektionID;
    private int dauer;
    private Modul modul;
    private Klasse klasse;
    private Lehrer lehrer;
    private Lernzimmer lernzimmer;

    public Lektion(long lektionID, int dauer, Modul modul, Klasse klasse, Lehrer lehrer, Lernzimmer lernzimmer) {
        this.lektionID = lektionID;
        this.dauer = dauer;
        this.modul = modul;
        this.klasse = klasse;
        this.lehrer = lehrer;
        this.lernzimmer = lernzimmer;
    }

    public Long getLektionID() {
        return lektionID;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public Lehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
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
}
