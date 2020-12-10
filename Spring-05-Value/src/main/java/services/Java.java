package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

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

    @Autowired
    @Qualifier("officeHours")
    ExtraSessions extraSessions;

//    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+(20+extraSessions.getHours()));
    }
}
