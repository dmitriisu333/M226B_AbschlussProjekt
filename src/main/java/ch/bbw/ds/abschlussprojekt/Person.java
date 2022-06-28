package ch.bbw.ds.abschlussprojekt;

/**
 * @Autor Dmitrii Subeichin
 * @Version 28.06.22
 */

public abstract class Person {
    protected Long id;
    protected String name;
    protected String vorname;
    protected int alter;
    protected String geschlecht;
    protected String email;
    protected String telefonnummer;
    protected Addresse adresse;

    public Person(Long id, String name, String vorname, int alter, String geschlecht, String email, String telefonnummer, Addresse adresse) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.email = email;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
    }

    public abstract Long getId();

    public abstract void setId(Long id);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getVorname();

    public abstract void setVorname(String vorname);

    public abstract int getAlter();

    public abstract void setAlter(int alter);

    public abstract String getGeschlecht();

    public abstract void setGeschlecht(String geschlecht);

    public abstract String getEmail();

    public abstract void setEmail(String email);

    public abstract String getTelefonnummer();

    public abstract void setTelefonnummer(String telefonnummer);

    public abstract Addresse getAdresse();

    public abstract void setAdresse(Addresse adresse);

}
