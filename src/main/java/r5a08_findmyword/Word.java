package r5a08_findmyword;

public class Word {
    private String word;
    public Word(String correctWord) {
        this.word = correctWord;
    }
    public Score guess(String attempt) {
        Score score = new Score(word);
        score.assess(0, attempt);
        return score;
    }
}