package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        MessageSender reportMessageSender = new LogReportMessageSender(PriorityLevel.LOW);
        MessageSender emailMessageSender = new EmailMessageSender(PriorityLevel.MIDDLE);
        MessageSender smsMessageSender = new SMSMessageSender(PriorityLevel.HIGH);

        reportMessageSender.setNextMessageSender(emailMessageSender);
        emailMessageSender.setNextMessageSender(smsMessageSender);

        reportMessageSender.messageSenderManager("Something is happening!", PriorityLevel.LOW);

        System.out.println("---------------------------------------------------------------------");
        reportMessageSender.messageSenderManager("Something went wrong!", PriorityLevel.MIDDLE);

        System.out.println("---------------------------------------------------------------------");
        reportMessageSender.messageSenderManager("We had a problem!", PriorityLevel.HIGH);

    }
}
