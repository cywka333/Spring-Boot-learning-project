package pl.mentoring.devs.secondspringproject.reminder.service;

public class MobileService implements MessagingService{
    @Override
    public void send() {
        System.out.println("Sending out message to mobile.");
    }
}
