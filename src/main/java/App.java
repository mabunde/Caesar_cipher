import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        boolean programRunning = true;
        Scanner in =new Scanner(System.in);
        try {
            System.out.println("Welcome to caesar cipher, choose one option: encoding, decoding ,Exit");
            String navigationChoice = in.nextLine();
            if (navigationChoice.equals("encoding")) {
                //prompt the user to enter the text
                System.out.println("Enter plain text >> ");
                String plain = in.nextLine();
                //prompt the user to enter the key
                System.out.println("Enter key >> ");
                int pKey = in.nextInt();
                //call encoding method
                String cText = Cipher.encoding(plain, pKey);
                System.out.println("The cipher text is >> " + cText);
            } else if (navigationChoice.equals("decoding")) {
                // decoding the cipher
                System.out.println("Enter the cipher text >> ");
                String cipher = in.nextLine();
                System.out.println("Enter key >> ");
                int cKey = in.nextInt();
                String pText = Cipher.decoding(cipher, cKey);
                System.out.println("The cipher text is >> " + pText);
            } else if (navigationChoice.equals("Exit")) {
                System.out.println("Goodbye!");
                programRunning = false;
            } else {
                System.out.println("I'm sorry, we don't recognize your input");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
