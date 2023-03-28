package pl.mentoring.devs.secondspringproject.reminder.notifier;

import org.springframework.stereotype.Component;
import pl.mentoring.devs.secondspringproject.reminder.service.MessagingService;

@Component
public class NotificationSender {
    private final MessagingService messagingService;

    public NotificationSender(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public void sendReminder(){
        messagingService.send();
    }
}
