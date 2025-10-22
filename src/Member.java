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

    public Member() {
        super();
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

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public void setMembershipRenewalDate(String membershipRenewalDate) {
        this.membershipRenewalDate = membershipRenewalDate;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    @Override
    public String toString() {
        return getName() + " " + getAdress() + " " + getMail() + " " + getPersNr() + " " + getSignUpDate() + " " + getMembershipRenewalDate() + " " + getMembershipLevel();
    }

}
