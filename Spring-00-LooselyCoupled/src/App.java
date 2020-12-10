import services.MentorAccount;
import services.PartTimeMentor;

public class App {

    public static void main(String[] args) {

       // FullTimeMentor fullTime= new FullTimeMentor();
        PartTimeMentor partTime= new PartTimeMentor();

        MentorAccount mentor= new MentorAccount(partTime);

        mentor.manageAccount();
    }
}
