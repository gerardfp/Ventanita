import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class VentanitaTests {

    @Test
    void getRandomNumber() {
        Ventanita ventanita = new Ventanita();

        boolean[] check = new boolean[6];
        for (int i = 0; i < 100000; i++) {
            int random = ventanita.getRandomNumber();
            if (random < 1 || random > 6) {
                fail("Number " + random + " outside bounds");
            } else {
                check[random-1] = true;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (!check[i]){
                fail("Number " + (i+1) + " never generated");
            }
        }
    }
}
