public class MembershipStatus {

    private final boolean isActive;
    private final Member member;
    private final String userInput;

    public MembershipStatus(boolean isActive, Member member, String userInput) {
        this.isActive = isActive;
        this.member = member;
        this.userInput = userInput;
    }

    public boolean isActive() {
        return isActive;
    }

    public Member getMember() {
        return member;
    }

    public String getUserInput() {
        return userInput;
    }
}
