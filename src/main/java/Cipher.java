public class Cipher {
    private int key;
    private String text;

    public Cipher(String text) {
        this.text =text;

    }

    public boolean isString(){
        for (int i = 0; i < this.text.length(); i++){
            if (this.text.charAt(i) >= '0' && this.text.charAt(i) <= '9'){
                return false;
            }
        }
        return true;
    }
}
