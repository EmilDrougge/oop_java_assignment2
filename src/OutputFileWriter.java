import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class OutputFileWriter {

    public void outputFileWrite(Member member) {

        Path p = Paths.get("src/ptfil.txt");

        try {
            if (!Files.exists(p)) {
             Files.createFile(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(p.toFile(), true))) {
            bw.write(member.getName() + ", " + member.getPersNr() + " : " + LocalDate.now());
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
