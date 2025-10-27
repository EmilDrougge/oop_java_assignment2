import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MembershipTest {

    private final List<Member> members = new ArrayList<>();
    private Member testmember1;
    private Member testmember2;

    @BeforeEach
    void setupTestMember() {
        Member testperson1 = new Member("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345", "2019-12-30", "2021-12-30", "platina");
        Member testperson2 = new Member("Medlem2", "Testadressen 2", "mail2@email.com", "123456-1234", "2024-01-01", "2025-01-01", "guld");

        testmember1 = new Member("member3", "Testadress 3", "mail3@mail.com", "456789-2345", "2000-01-05", LocalDate.now().toString(), "standard");
        testmember2 = new Member("member4", "Testadress 4", "mail4@mail.com", "456789-2345", "2000-01-05", "2021-12-30", "standard");

        members.add(testperson1);
        members.add(testperson2);

    }

    @Test
    public void testFindMemberByName() {
        Membership service = new Membership();
        Member found = service.findMember(members, "Medlem1");
        assertNotNull(found);
        assertEquals("Medlem1", found.getName());
    }

    @Test
    public void testCheckMembershipActive() {
        Membership service = new Membership();
        MembershipStatus status = service.checkMemberShip(members, "Medlem1");
        assertFalse(status.isActive());
        MembershipStatus status1 = service.checkMemberShip(members, "Medlem2");
        assertTrue(status1.isActive());
    }

    @Test
    void isCurrentMember() {
        LocalDate renewalDate1 = LocalDate.parse(testmember1.getMembershipRenewalDate());
        LocalDate renewalDate2 = LocalDate.parse(testmember2.getMembershipRenewalDate());
        assertTrue(renewalDate1.isAfter(LocalDate.now().minusYears(1)));
        assertFalse(renewalDate2.isAfter(LocalDate.now().minusYears(1)));
    }
}