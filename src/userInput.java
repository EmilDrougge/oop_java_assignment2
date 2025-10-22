import java.util.List;
import java.util.Scanner;

public class userInput {
    private final Membership membership;
    private final OutputFileWriter outputFileWriter;

    public userInput(Membership membership, OutputFileWriter outputFileWriter) {
        this.membership = membership;
        this.outputFileWriter = outputFileWriter;
    }

    public void run(List<Member> members) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            IO.println("Skriv in namn eller personnummer");
            String userInput = sc.nextLine();

            if(userInput.equalsIgnoreCase("exit")) {
                IO.println("Program avslutas");
                return;
            }

            MembershipStatus status = membership.checkMemberShip(members, userInput);
            IO.println(status.getUserInput());

            if(status.isActive()) {
                outputFileWriter.outputFileWrite(status.getMember());
            }
        }
    }


}
