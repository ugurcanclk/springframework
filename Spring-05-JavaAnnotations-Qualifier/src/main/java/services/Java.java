package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {

    //@Autowired  //bu annotation gidiyor bu sinifi implement eden java classlarina bakiyor ama bu senaryoda 2 tane var kafasi karisiyor.iste bu noktada devreye qualifier tagi giriyor
    //@Qualifier("mockInterviewHours")  // iste boyle specify ederek hangisini almasi gerektini soyluyorz
    ExtraSessions extraSessions;



    @Autowired// eger bir tane constructor varsa autowired koymaya gerek yok
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {   //qualifier with constructor
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours : "+(20+extraSessions.getHours()));
    }
}
