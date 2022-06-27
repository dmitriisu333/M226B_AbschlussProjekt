package ch.bbw.ds.abschlussprojekt;

public class Student extends Person{

    public Student(Long id, String name, String vorname, int alter, String geschlecht,
                   String email, String telefonnummer, Addresse adresse) {
        super(id, name, vorname, alter, geschlecht, email, telefonnummer, adresse);

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
