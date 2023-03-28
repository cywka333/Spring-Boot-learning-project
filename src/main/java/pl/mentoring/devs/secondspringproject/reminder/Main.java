package pl.mentoring.devs.secondspringproject.reminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.secondspringproject.reminder.notifier.NotificationSender;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

        NotificationSender notificationSender = (NotificationSender) context.getBean("notificationSender");
        notificationSender.sendReminder();
    }
}
