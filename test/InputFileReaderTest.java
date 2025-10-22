import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputFileReaderTest {

    private InputFileReader reader;

    @BeforeEach
    void setup() {
        reader = new InputFileReader();
    }

    @Test
    void testReadReturnMembersList() {
        List<Member> members = reader.read();
        assertNotNull(members);
        assertFalse(members.isEmpty());
    }

}