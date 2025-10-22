public class Person {

    private  String name;
    private  String adress;
    private  String mail;
    private  String persNr;


    public Person(String name, String adress, String mail, String persNr) {
        this.name = name;
        this.adress = adress;
        this.mail = mail;
        this.persNr = persNr;
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPersNr(String persNr) {
        this.persNr = persNr;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
