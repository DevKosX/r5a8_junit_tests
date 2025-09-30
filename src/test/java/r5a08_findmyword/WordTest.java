package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {
    @Test
    public void should_check_one_incorrect_letter() {
        Word word = new Word("E");
        Score result = word.guess("B");

        Letter expected = result.letter(0);
        Letter actual = Letter.INCORRECT;
        assertEquals(expected, actual, "Incorrect");
    }

    @Test
    public void should_check_one_correct_letter() {
        Word word = new Word("A");
        Score result = word.guess("A");

        Letter expected = result.letter(6);
        Letter actual = Letter.CORRECT;
        assertEquals(expected, actual,"Correct");

    }
    @Test
    public void should_check_one_correct_letter_but_not_good_place() {
        Word word = new Word("B");
        Score result = word.guess("B");

        Letter expected = result.letter(1);
        Letter actual = Letter.PART_CORRECT;

        assertEquals(expected, actual,"Correct mal placé" );

    }

}
