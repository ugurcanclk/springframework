

public class Mentor {

    FullTimeMentor fullTimeMentor; //composition yaptim
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}
