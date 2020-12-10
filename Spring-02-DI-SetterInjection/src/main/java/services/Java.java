package services;

import interfaces.Course;
import interfaces.ExtraSessions;

public class Java implements Course {

    private ExtraSessions extraSessions;

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+(20+extraSessions.getHours()));
    }
}
