package ch.bbw.ds.abschlussprojekt;

public class Student extends Person{
    private Klasse klasse;
    public Student(Long id, String name, String vorname, int alter, String geschlecht,
                   String email, String telefonnummer, Addresse adresse, Klasse klasse) {
        super(id, name, vorname, alter, geschlecht, email, telefonnummer, adresse);
        this.klasse = klasse;
    }

}
