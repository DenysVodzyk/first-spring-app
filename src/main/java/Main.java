import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloKittyService;
import service.HelloWorldService;
import service.IGreetingService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        IGreetingService service = (HelloWorldService) ctx.getBean("helloWorldService");
        service.sendGreeting();

        IGreetingService kittyService = (HelloKittyService) ctx.getBean("helloKittyService");
        kittyService.sendGreeting();

    }
}
