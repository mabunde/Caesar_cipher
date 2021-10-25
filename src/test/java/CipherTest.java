import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CipherTest {
    @Test
    public void checkInput_checkIfInputIsAString() {
        Cipher value = new Cipher("z");
        assertEquals(true, value.isString());
    }

}