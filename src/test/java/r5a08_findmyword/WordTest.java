package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {
    //Test de vérification pour une lettre incorrecte

    private void should_assert_extracted(String attempt, Letter expected, int position){
        Letter actual = score.letter(position);
        Letter expected = Letter.INCORRECT;
        assertEquals(expected, actual, "Incorrect");
    }

    @Test
    public void should_check_one_incorrect_letter() {
        Word word = new Word("E");
        should_assert_extracted("B", 0, Letter.INCORRECT);
    }


    // Test de vérification pour une lettre correcte
    @Test
    public void should_check_one_correct_letter() {
        Word word = new Word("A");
        should_assert_extracted(word, "A", 0, Letter.CORRECT, "Correct");

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