package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Abir", "Hasan");
        email.setAlternateMail("js@gmail.com");
        System.out.println(email.getAlternateMail());
    }
}
