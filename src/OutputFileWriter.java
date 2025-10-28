import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class OutputFileWriter {

    public void outputFileWrite(Member member, Path filepath) {
        try {
            if (!Files.exists(filepath)) {
             Files.createFile(filepath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath.toFile(), true))) {
            bw.write(member.getName() + ", " + member.getPersNr() + " : " + LocalDate.now());
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
