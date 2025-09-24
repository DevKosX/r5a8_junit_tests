package r5a08.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserGreatingTest {

    // Test 1 : vérifier que "titi" renvoie "Bonjour, titi"
    @Test
    public void whenTitiParameter_thenReturnCorrectGreeting() {
        String actual = UserGreating.formatGreating("titi");
        String expected = "Bonjour, titi";
        Assertions.assertEquals(expected, actual);
    }

    // Test 2 : vérifier que "tata" renvoie "Bonjour, tata"
    @Test
    public void whenTataParameter_thenReturnCorrectGreeting() {
        String actual = UserGreating.formatGreating("tata");
        String expected = "Bonjour, tata";
        Assertions.assertEquals(expected, actual);
    }

    // Test 3 : vérifier que chaîne vide renvoie "Bonjour, "
    @Test
    public void whenEmptyString_thenReturnGreetingWithEmptyName() {
        String actual = UserGreating.formatGreating("");
        String expected = "Bonjour, ";
        Assertions.assertEquals(expected, actual);
    }

    // Test 4 : vérifier que null renvoie "Bonjour, invité"
    @Test
    public void whenNull_thenReturnGreetingWithGuest() {
        String actual = UserGreating.formatGreating(null);
        String expected = "Bonjour, invité";
        Assertions.assertEquals(expected, actual);
    }
}
