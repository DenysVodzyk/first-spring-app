package service;

public class HelloWorldService implements IGreetingService {
    public String message;

    public HelloWorldService() {
        this.message = "";
    }

    public HelloWorldService(String message) {
        this.message = message;
    }

    public void sendGreeting() {
        System.out.println("Hello, world!" + message);
    }
}