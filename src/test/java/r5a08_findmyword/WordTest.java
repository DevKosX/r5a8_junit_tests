package r5a08_findmyword;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {
    //Test de vérification pour une lettre incorrecte
    private Word deuxLettre;
    private Word uneLettre;
    private Word plusieursLettre;

    @BeforeEach // vue en cours
    public void uneLettreGenere() {
        // le mot correct par défaut pour tous les tests que j'ai fait
        uneLettre = new Word("A");
    }
     //methode exctract
    private void should_assert_extracted_one_letter(String attempt, Letter expected, int position) {
        Score score = uneLettre.guess(attempt);
        Letter actual = score.letter(position);
        assertEquals(expected, actual);
    }

    @Test
    public void should_check_one_incorrect_letter() {
        should_assert_extracted_one_letter("B", Letter.INCORRECT, 0);
        System.out.println("\nTest : lettre incorrecte passé");
    }


    // Test de vérification pour une lettre correcte
    @Test
    public void should_check_one_correct_letter() {
        should_assert_extracted_one_letter("A", Letter.CORRECT, 0);
        System.out.println("\nTest : lettre correcte à la bonne position passé");
    }

    //

    @BeforeEach // vue en cours
    public void deuxLettres() {
        // pour le test avec deux lettres
        deuxLettre = new Word("BA");
    }


    private void should_assert_extracted_two_letter(String attempt, Letter expected, int position) {
        Score score = deuxLettre.guess(attempt);
        Letter actual = score.letter(position);
        assertEquals(expected, actual);
    }

    @Test
    public void should_check_one_correct_letter_but_wrong_position() {
        should_assert_extracted_two_letter("AB", Letter.PART_CORRECT, 0);
        System.out.println("\nTest : lettre correcte mais à la mauvaise position passé");
    }

    //


    @BeforeEach // vue en cours
    public void plusieursLettres() {
        //pour le test avec plusieurs lettres
        plusieursLettre = new Word("TEST");
    }

    private void should_assert_extracted_several_letter(String attempt, Letter expected, int position) {
        Score score = plusieursLettre.guess(attempt);
        Letter actual = score.letter(position);
        assertEquals(expected, actual);
    }

    @Test
    public void should_check_multiple_incorrect_letters() {
        should_assert_extracted_several_letter("BBBB", Letter.INCORRECT, 0);
        System.out.println("\nTest : toutes les lettres sont incorrectes passé");
    }


    //Test de vérification pour une lettre correct mais pas à la bonne place
    //@Test
    //public void should_check_one_correct_letter_but_not_good_place() {
        //Word word = new Word("BABBABABABAB");
        //Score result = word.guess("BBBBABAAB");

        //Letter actual = result.letter(6);
       // Letter expected = Letter.PART_CORRECT;

     //   assertEquals(expected, actual, "Correct mal placé");

   // }
}