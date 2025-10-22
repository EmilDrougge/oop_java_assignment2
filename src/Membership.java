import java.time.LocalDate;
import java.util.List;

public class Membership {


    public Member findMember(List<Member> memberList, String userInput) {
        for(Member member : memberList) {
            if(member.getName().toLowerCase().equalsIgnoreCase(userInput) || member.getPersNr().equals(userInput)) {
                return member;
            }
        }
        return null;
    }

    public boolean isCurrentMember(Member member) {
        LocalDate renewalDate = LocalDate.parse(member.getMembershipRenewalDate());
        return renewalDate.isAfter(LocalDate.now().minusYears(1));
    }

    public MembershipStatus checkMemberShip(List<Member> members, String userInput) {
        Member member = findMember(members, userInput);

        if (member == null) {
            return new MembershipStatus(false, null, "Ej kund!");
        }

        if (isCurrentMember(member)) {
            String message = member.getName() + " är nuvarande medlem på " +
                    member.getMembershipLevel().toLowerCase() + " nivå";
            return new MembershipStatus(true, member, message);
        }
        return new MembershipStatus(false, member, "Gammal kund, måste förnya medlemskap");
    }
}
