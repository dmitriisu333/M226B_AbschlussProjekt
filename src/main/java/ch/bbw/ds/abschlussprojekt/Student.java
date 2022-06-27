package ch.bbw.ds.abschlussprojekt;

public class Student extends Person{

    public Student(Long id, String name, String vorname, int alter, String geschlecht,
                   String email, String telefonnummer, Addresse adresse) {
        super(id, name, vorname, alter, geschlecht, email, telefonnummer, adresse);

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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", alter=" + alter +
                ", geschlecht='" + geschlecht + '\'' +
                ", email='" + email + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
