package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

public class Java implements Course {

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions){
        this.extraSessions=extraSessions;
    }




    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+(30+extraSessions.getHours()));
    }



    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;


    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
