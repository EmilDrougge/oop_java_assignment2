public class Member extends Person {

    private String signUpDate;
    private String membershipRenewalDate;
    private String membershipLevel;

    public Member(String name, String adress, String mail, String persNr, String signUpDate, String membershipRenewalDate, String membershipLevel) {
        super(name, adress, mail, persNr);
        this.signUpDate = signUpDate;
        this.membershipRenewalDate = membershipRenewalDate;
        this.membershipLevel = membershipLevel;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public String getMembershipRenewalDate() {
        return membershipRenewalDate;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

}
