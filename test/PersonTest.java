import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getNameTest() {
        Person testPerson = new Person("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345");
        assertEquals("Medlem1", testPerson.getName());
        assertNotEquals("ickemedlem", testPerson.getName());
    }

    @Test
    void getAdressTest() {
        Person testPerson = new Person("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345");
        assertEquals("Testadressen 1", testPerson.getAdress());
        assertNotEquals("feladressen 12", testPerson.getAdress());
    }

    @Test
    void getMailTest() {
        Person testPerson = new Person("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345");
        assertEquals("mail1@email.com", testPerson.getMail());
        assertNotEquals("byebye.com", testPerson.getMail());
    }

    @Test
    void getPersNrTest() {
        Person testPerson = new Person("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345");
        assertEquals("190723-2345", testPerson.getPersNr());
        assertNotEquals("123456-2345", testPerson.getPersNr());
    }

}