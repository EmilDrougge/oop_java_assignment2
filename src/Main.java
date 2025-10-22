import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        InputFileReader fileReader = new InputFileReader();
        List<Member> members = fileReader.read();

        Membership membership = new Membership();
        OutputFileWriter outputWriter = new OutputFileWriter();

        userInput ui = new userInput(membership, outputWriter);

        ui.run(members);

    }
}
