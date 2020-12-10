import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.Java;

public class App {

    public static void main(String[] args) {

        ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("java",Course.class);
        Course course2= container.getBean("java",Course.class);

        System.out.println("Pointing to the same object:"+(course1==course2));//eger config.xml file daki scope protetype sa burasi false cikar
        System.out.println("Memory Location for the course1:"+course1);
        System.out.println("Memory Location for the course2:"+course2);


    }
}
