import implemantation.Mentor_Practice;
import services.FullTimeMentor_Practice;
import services.MentorAccount_Practice;

public class App_Practice {
    public static void main(String[] args) {

        //FullTimeMentor_Practice fullTimeMentor_practice= new FullTimeMentor_Practice();

        Mentor_Practice mentor_practice= new FullTimeMentor_Practice();

        MentorAccount_Practice mentorAccount_practice= new MentorAccount_Practice(mentor_practice);

        mentorAccount_practice.manageAccount();
    }
}
