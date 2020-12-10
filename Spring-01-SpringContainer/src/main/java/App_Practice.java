import interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;
import services.PartTimeMentor;

public class App_Practice {
    public static void main(String[] args) {

        //once container olustur ve bu container configuration dosyasini icersin
        ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");


        //daha sonra olusturdugun bu container la onjeyi cagir
        Mentor mentor=container.getBean("fullTimeMentor",Mentor.class);

        Mentor mentor1=container.getBean("partTimeMentor",Mentor.class);

        mentor.createAccount();
        mentor1.createAccount();

    }
}
