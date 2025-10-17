public class Person {

    private final String name;
    private final String adress;
    private final String mail;
    private final String persNr;


    public Person(String name, String adress, String mail, String persNr) {
        this.name = name;
        this.adress = adress;
        this.mail = mail;
        this.persNr = persNr;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getMail() {
        return mail;
    }

    public String getPersNr() {
        return persNr;
    }
}
