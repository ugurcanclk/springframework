package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {

    //Field Injection
    @Autowired
    ExtraSessions extraSessions;


    //Constructor Injection => spring will find a bean that implements ExtraSessions

//    @Autowired
//    public Java(ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }

    //Setter Injection
//    @Autowired
//    public void setExtraSessions(ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" +(30+extraSessions.getHours()));
    }
}
