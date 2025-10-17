import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void getSignUpDateTest() {
        Member testMember = new Member("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345", "2019-12-30", "2021-12-30", "platina");
        assertEquals("2019-12-30", testMember.getSignUpDate());
        assertNotEquals("2021-12-30", testMember.getSignUpDate());
    }

    @Test
    void getMembershipRenewalDateTest() {
        Member testMember = new Member("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345", "2019-12-30", "2021-12-30", "platina");
        assertEquals("2021-12-30", testMember.getMembershipRenewalDate());
        assertNotEquals("2028-12-30", testMember.getMembershipRenewalDate());
    }

    @Test
    void getMembershipLevelTest() {
        Member testMember = new Member("Medlem1", "Testadressen 1", "mail1@email.com", "190723-2345", "2019-12-30", "2021-12-30", "platina");
        assertEquals("platina", testMember.getMembershipLevel());
        assertNotEquals("guld", testMember.getMembershipLevel());
    }

}