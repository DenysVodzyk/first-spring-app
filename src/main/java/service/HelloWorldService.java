package service;

public class HelloWorldService implements IGreetingService {
    public void sendGreeting() {
        System.out.println("Hello, world!");
    }
}