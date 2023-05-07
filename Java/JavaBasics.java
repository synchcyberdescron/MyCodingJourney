package Java;
import java.util.Scanner;
import javax.swing.*;
class JavaBasics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Learning Java");
        
        String uName = "Software";
        String pWord = "Engineer";
        String username = "";
        String password = "";
        
        do{
            System.out.println("Enter username:");
            username = scanner.nextLine();
            System.out.println("Enter password");
            password = scanner.nextLine();
            if(uName.equals(username) && pWord.equals(password)){
                System.out.println("Authorized user.Access Granted!");
            }else{
                System.out.println("Unaouthorized User.Access Denied!");
            }
        }while(!uName.equals(username) || !pWord.equals(password));
        
    }

}