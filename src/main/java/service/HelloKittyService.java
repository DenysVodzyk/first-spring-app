package service;

public class HelloKittyService implements IGreetingService {
    private HelloWorldService helloWorldService;

    public void sendGreeting() {
        System.out.println("Hello, Kitty!");
    }
}
