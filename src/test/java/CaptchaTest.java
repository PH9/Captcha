import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    @Test
    public void testCaptcha_withFirstPattern() {
        Captcha captcha = new Captcha(1, 1, 1, 3);
        assertEquals("1 + Three", captcha.toString());
    }

    @Test
    public void testCaptcha_withSecondPattern() {
        Captcha captcha = new Captcha(2, 5,3,9);
        assertEquals("Five / 9", captcha.toString());
    }
}