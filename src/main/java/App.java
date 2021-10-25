import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter plain text >>");
        String plain =in.nextLine();

        System.out.println("Enter key >>");
        int key =in.nextInt();


        String cText =encoding(plain,key);
        System.out.println("The cipher text is >>" + cText);

    }
}
