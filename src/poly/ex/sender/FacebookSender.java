package poly.ex.sender;

public class FacebookSender implements Sender{
    @Override
    public void sendMessage(String a) {
        System.out.println("Facebook에 발송합니다. " + a);
    }
}
