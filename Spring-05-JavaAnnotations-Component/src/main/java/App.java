import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");

        Course course= container.getBean("API",Course.class); //eger sinif adinin hepsi uppercase ise buraya aynen yazmamiz lazim.
        //eger Java gibiyse java yazmak lazim

        Course course1= container.getBean("java",Course.class); //Java diye yazsam burada hata vermez ancak console da run ettigimde hata verir.

        course.getTeachingHours();

        course1.getTeachingHours();
    }
}
