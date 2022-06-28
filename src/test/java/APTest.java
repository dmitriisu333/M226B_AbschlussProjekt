import ch.bbw.ds.abschlussprojekt.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class APTest {

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
    Student sus5 = new Student(4L, "", "", 18, "", "", "", a5);

    Lehrer lp1 = new Lehrer(1L, "", "", 18, "", "", "", a1, 500);

    Klasse k1 = new Klasse(1L, "", 2, lp1, 4);

    //Module
    Modul m1 = new Modul(1L, 226,"", "");

    //Lernzimmer
    Lernzimmer lz1 = new Lernzimmer(1L, 223, 4, 1, 1, 1);

    //Lektionen
    Lektion l1 = new Lektion(1L, 45, m1, lz1);
    Lektion l2 = new Lektion(2L, 45, m1, lz1);
    Lektion l3 = new Lektion(3L, 45, m1, lz1);
    Lektion l4= new Lektion(4L, 45, m1, lz1);
    Lektion l5= new Lektion(4L, 45, m1, lz1);

    @Test
    public void addLektionToKlasseTest() {
        try {
            k1.addLektion(l1);
            k1.addLektion(l2);
            k1.addLektion(l3);
            k1.addLektion(l4);
            k1.addLektion(l5);
            fail("Etwas falsch");
        } catch (AbschlussprojektException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void addLektionToLehrerTest()  {
        try {
            lp1.addLektion(l1);
            lp1.addLektion(l2);
            lp1.addLektion(l3);
            lp1.addLektion(l4);
            fail("Etwas falsch");
        } catch (AbschlussprojektException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void addStudentToKlasseTest() {
        try {
            k1.addStudent(sus1);
            k1.addStudent(sus2);
            k1.addStudent(sus3);
            k1.addStudent(sus4);
            k1.addStudent(sus5);
            fail("Etwas falsch");
        } catch (AbschlussprojektException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void removeStudentTest()  {
        try {
            k1.addStudent(sus1);
            k1.addStudent(sus2);
            k1.addStudent(sus3);
            k1.addStudent(sus4);


            k1.removeStudent(sus1);
            k1.removeStudent(sus4);
            k1.removeStudent(sus3);
            k1.removeStudent(sus2);
            fail("Etwas falsch");
        } catch (AbschlussprojektException e) {
            throw new RuntimeException(e);
        }

    }

}
