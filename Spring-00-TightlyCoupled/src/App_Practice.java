public class App_Practice {

    public static void main(String[] args) {


        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        Mentor_Practice mentor_practice = new Mentor_Practice(fullTimeMentor, partTimeMentor);

        mentor_practice.manageAccount();

    }
}
