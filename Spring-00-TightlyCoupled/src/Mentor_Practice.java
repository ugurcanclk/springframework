public class Mentor_Practice {

    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor_Practice(FullTimeMentor fullTimeMentor,PartTimeMentor partTimeMentor){
        this.fullTimeMentor=fullTimeMentor;
        this.partTimeMentor=partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}
