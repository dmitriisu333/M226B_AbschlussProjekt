package ch.bbw.ds.abschlussprojekt;

public class Main {
    public static void main(String[] args) {
        Addresse a1 = new Addresse(13, "", "", "", "");
        Addresse a2 = new Addresse(13, "", "", "", "");
        Addresse a3 = new Addresse(13, "", "", "", "");
        Addresse a4 = new Addresse(13, "", "", "", "");
        Addresse a5 = new Addresse(13, "", "", "", "");

        Student sus1 = new Student(1L, "", "", 18, "", "", "", a2);
        Student sus2 = new Student(1L, "", "", 18, "", "", "", a3);
        Student sus3 = new Student(1L, "", "", 18, "", "", "", a4);
        Student sus4 = new Student(1L, "", "", 18, "", "", "", a5);

        Lehrer l1 = new Lehrer(1L, "", "", 18, "", "", "", a1, 500);

        Klasse k1 = new Klasse(1L, "", 2, l1);
        k1.addStudent(sus1);
    }
}
