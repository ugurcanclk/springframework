package services;


import implemantation.Mentor_Practice;

public class MentorAccount_Practice {

    Mentor_Practice mentor_practice;

    public MentorAccount_Practice(Mentor_Practice mentor_practice){
        this.mentor_practice=mentor_practice;

    }

    public void manageAccount(){
        mentor_practice.createAccount();
    }
}
