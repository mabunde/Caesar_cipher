import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CipherTest {
    @Test
    public void checkInput_checkIfInputIsAString() {
        Cipher value = new Cipher("z");
        assertEquals(true, value.isString());
    }

    @Test
    public void checkInput_checkIfKeyIsInRange() {
        Cipher value = new Cipher(25);
        assertEquals(true, value.isInRange());
    }

}