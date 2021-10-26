import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        //prompt the user to enter the text
        System.out.println("Enter plain text >> ");
        String plain =in.nextLine();
        //prompt the user to enter the key
        System.out.println("Enter key >> ");
        int Key =in.nextInt();
        //call encoding method
        String cText =Cipher.encoding(plain,Key);
        System.out.println("The cipher text is >>" + cText);



    }
}
