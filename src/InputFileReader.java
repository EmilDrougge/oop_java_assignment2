import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {

    public List<Member> read() {

        List<Member> memberList = new ArrayList<>();

        try(FileReader fr = new FileReader("src/gym_members.txt");
            BufferedReader br = new BufferedReader(fr)) {

            String inputTextFile;

            while((inputTextFile = br.readLine()) != null) {

                String[] inputMemberInfo = inputTextFile.split(";");

                Member member = new Member (
                        inputMemberInfo[0].trim(),
                        inputMemberInfo[1].trim(),
                        inputMemberInfo[2].trim(),
                        inputMemberInfo[3].trim(),
                        inputMemberInfo[4].trim(),
                        inputMemberInfo[5].trim(),
                        inputMemberInfo[6].trim()
                );
                memberList.add(member);
            }

            memberList.removeFirst();

        } catch (FileNotFoundException e) {
            System.out.println("Fil ej funnen");
            System.exit(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return memberList;
    }
}
