package Java;
import java.util.ArrayList;
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
        
        /*
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
        
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>0;i--){
            for(int j=3;j<=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        

        ArrayList<String> food = new ArrayList<String>();

        food.add("Hamburger");
        food.add("Pizza");
        food.add("Hotdog");
        food.add("Hello");
        food.set(3, "Sushi");

        for (String string : food) {
            System.out.println(string);
        }
        */

        hello();

}
    static void hello(){
        System.out.println("Hello");
    }
}