public class Cipher {
    private int key;
    private String text;
    static String alphabet ="abcdefghijklmnopqrstuvwxyz";

    public Cipher(String text) {
        this.text =text;
    }
    public Cipher(int key) {
        this.key=key;
    }


    public boolean isString(){
        for (int i = 0; i < this.text.length(); i++){
            if (this.text.charAt(i) >= '0' && this.text.charAt(i) <= '9'){
                return false;
            }
        }
        return true;
    }

    public boolean isInRange(){
        return this.key >= 1 && this.key <= 25;
    }
 public static String encoding(String plainText,int key){
        plainText=plainText.toLowerCase();// turn the user input to lowercase
        String cipherText ="";// initialize to empty string
       for(int i =0;i<plainText.length();i++){
           int charIndex =alphabet.indexOf(plainText.charAt(i));//getting index of each character
           int newIndex=(charIndex+key)%26;
           char cipherChar =alphabet.charAt(newIndex); // getting character at my new index
           cipherText=cipherText+cipherChar;// append characters to cipherText
       }
        return cipherText;
    }
    public static String decoding(String cipherText, int key){

        cipherText=cipherText.toLowerCase();//turn cipherText to lowercase
        String plainText ="";
        for (int i =0;i<cipherText.length();i++){
            int charIndex =alphabet.indexOf(cipherText.charAt(i));
            int newIndex =(charIndex-key);
            if(newIndex<0){
                newIndex =alphabet.length() +newIndex;// taking care of negative values
            }
            char plainChar = alphabet.charAt(newIndex);
            plainText = plainText + plainChar;

        }
        return plainText;


    }

}
