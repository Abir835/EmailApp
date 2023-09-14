package EmailApp;
import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPassword = 8;
    private String department;
    private int mailBoxCapacity;
    private String alternateMail;
    private String email;
    private String companySuffix = "bs-23.com";

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Created: " +this.firstName+ " "+ this.lastName);
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);
        System.out.println("Password: "+ randomPassword(this.defaultPassword));
        this.email = firstName+"."+lastName+"."+this.department.toLowerCase()+"@"+companySuffix;
        System.out.println("Email: "+ this.email);
    }

    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){return "Sales";}
        else if (depChoice == 2){return "Dev";}
        else if (depChoice == 3){return "Acct." ;}
        else{return "";}
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890*#@!";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateMail(String altEmail){
        this.alternateMail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){return mailBoxCapacity;}
    public String getAlternateMail(){return alternateMail;}
    public String getPassword(){return password;}
}
