public class Person {
    private Long id;
    private String name;
    private String vorname;
    private int alter;
    private String geschlecht;
    private String email;
    private String telefonnummer;
    private Addresse adresse;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Addresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Addresse adresse) {
        this.adresse = adresse;
    }
}
