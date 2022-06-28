package ch.bbw.ds.abschlussprojekt;

/**
 * @Autor Dmitrii Subeichin
 * @Version 28.06.22
 */

public class Modul {
    private Long modulID;
    private int modulNummer;
    private String modulName;
    private String beschreibung;

    public Modul(Long modulID, int modulNummer, String modulName, String beschreibung) {
        this.modulID = modulID;
        this.modulNummer = modulNummer;
        this.modulName = modulName;
        this.beschreibung = beschreibung;
    }

    public Long getModulID() {
        return modulID;
    }

    public void setModulID(Long modulID) {
        this.modulID = modulID;
    }

    public int getModulNummer() {
        return modulNummer;
    }

    public void setModulNummer(int modulNummer) {
        this.modulNummer = modulNummer;
    }

    public String getModulName() {
        return modulName;
    }

    public void setModulName(String modulName) {
        this.modulName = modulName;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "modulID=" + modulID +
                ", modulNummer=" + modulNummer +
                ", modulName='" + modulName + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }
}
