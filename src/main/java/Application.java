import service.IGreetingService;

public class Application {
    public IGreetingService iGreetingService;

    public Application() {
    }

    public Application(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public void start() {
        if (iGreetingService != null) {
            iGreetingService.sendGreeting();
        }
    }
}

