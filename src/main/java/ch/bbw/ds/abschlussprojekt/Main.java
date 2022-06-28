package ch.bbw.ds.abschlussprojekt;

/**
 * @Autor Dmitrii Subeichin
 * @Version 28.06.22
 */

public class Main {
    public static void main(String[] args) throws AbschlussprojektException {

        //Addressen
        Addresse a1 = new Addresse(13, "", "", "", "");
        Addresse a2 = new Addresse(13, "", "", "", "");
        Addresse a3 = new Addresse(13, "", "", "", "");
        Addresse a4 = new Addresse(13, "", "", "", "");
        Addresse a5 = new Addresse(13, "", "", "", "");

        //Lernende
        Student sus1 = new Student(1L, "", "", 18, "", "", "", a2);
        Student sus2 = new Student(2L, "", "", 18, "", "", "", a3);
        Student sus3 = new Student(3L, "", "", 18, "", "", "", a4);
        Student sus4 = new Student(4L, "", "", 18, "", "", "", a5);

        System.out.println(sus1);
        //so man bearbeitet Studenten und andere Objekte
        sus1.setAlter(19);
        System.out.println(sus1);


        //Lehrpersonen
        Lehrer lp1 = new Lehrer(1L, "", "", 18, "", "", "", a1, 500);

        lp1.lohnBekommen(4000);
        System.out.println(lp1);
        lp1.lohnBekommen(4000);
        System.out.println(lp1);

        //Klassen
        Klasse k1 = new Klasse(1L, "", 2, lp1, 4);

        k1.addStudent(sus1);
        k1.addStudent(sus2);
        k1.addStudent(sus3);
        k1.addStudent(sus4);
        System.out.println(k1);

        //so loescht man ein Student von eine Klasse
        k1.removeStudent(sus1);
        System.out.println(k1);


        //Module
        Modul m1 = new Modul(1L, 226,"", "");

        //Lernzimmer
        Lernzimmer lz1 = new Lernzimmer(1L, 223, 4, 1, 1, 1);

        //Lektionen
        Lektion l1 = new Lektion(1L, 45, m1, lz1);
        Lektion l2 = new Lektion(2L, 45, m1, lz1);
        Lektion l3 = new Lektion(3L, 45, m1, lz1);
        Lektion l4= new Lektion(4L, 45, m1, lz1);
        Lektion l5= new Lektion(5L, 45, m1, lz1);


        //erstellt Stundenplan
        lp1.addLektion(l1);
        lp1.addLektion(l1);
        lp1.addLektion(l1);

        k1.addLektion(l1);
        k1.addLektion(l2);
        k1.addLektion(l3);
        k1.addLektion(l4);


        //zeigt Stundenplan
        lp1.printStundenplan();
        k1.printStundenplan();
    }
}
