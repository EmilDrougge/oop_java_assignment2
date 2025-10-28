import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

class OutputFileWriterTest {

        private OutputFileWriter writer;
        private Path testFilePath;

        @BeforeEach
        public void setUp() {
            writer = new OutputFileWriter();
            testFilePath = Paths.get("src/ptfiltest.txt");
            try {
                if (!Files.exists(testFilePath)) {
                    Files.createFile(testFilePath);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @AfterEach
        public void tearDown() throws IOException {
            if (Files.exists(testFilePath)) {
                Files.delete(testFilePath);
            }
        }

        @Test
        public void testOutputFileWrite() throws IOException {

            Member member = new Member("member3", "Testadress 3", "mail3@mail.com", "456789-2345", "2000-01-05", LocalDate.now().toString(), "standard");

            writer.outputFileWrite(member, testFilePath);

            assertTrue(Files.exists(testFilePath));

            List<String> lines = Files.readAllLines(testFilePath);
            assertEquals(1, lines.size());

            String writtenLine = lines.get(0);
            assertTrue(writtenLine.contains("member3"));
            assertTrue(writtenLine.contains("456789-2345"));
        }

        @Test
        public void testMultipleWrites() throws IOException {

            Member member1 = new Member("member3", "Testadress 3", "mail3@mail.com", "456789-2345", "2000-01-05", LocalDate.now().toString(), "standard");
            Member member2 = new Member("member4", "Testadress 4", "mail4@mail.com", "456789-2345", "2000-01-05", LocalDate.now().toString(), "standard");

            writer.outputFileWrite(member1, testFilePath);
            writer.outputFileWrite(member2, testFilePath);

            List<String> lines = Files.readAllLines(testFilePath);
            assertEquals(2, lines.size());
        }
    }
