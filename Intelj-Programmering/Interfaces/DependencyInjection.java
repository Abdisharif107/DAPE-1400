package Interfaces;

interface ISendMessage{
    public void send(String message);
}

class SendMail implements ISendMessage{
    public void send(String message){
        System.out.println("Do you want to send the mail as message : " +message);
    }
}

class SendSMS implements ISendMessage{
    public void send(String message){
        System.out.println("SMS has been delivered : " + message);
    }
}

class Message{
    private final ISendMessage messageType;

    public Message(ISendMessage messageType) {
        this.messageType = messageType;
    }
    public void sendMessage(String message) {
        messageType.send(message);
    }
}

public class DependencyInjection {
    public static void main(String [] args) {
        ISendMessage sms = new SendSMS();
        Message message1 = new Message(sms);
        message1.sendMessage("Hello");

        ISendMessage mail = new SendMail();
        Message message2 = new Message(mail);
        message2.sendMessage("Hey");
    }
}
