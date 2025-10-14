package r5a08_findmyword;

public class Score {

    private final String correct;
    private int position;
    private Letter result = Letter.INCORRECT;


    public Score(String correct) {
        this.correct=correct;
    }

    public Letter letter(int i){
        return result;
    }

    public void assess(int position, String attempt){
        char attemptChar = attempt.charAt(position);
        if (isCorrectLetter(position, attempt)){
            result = Letter.CORRECT;
        } else if (isPartiallyCorrect(attemptChar)) {
            result = Letter.PART_CORRECT;
        } else {
            result = Letter.INCORRECT;
        }
    }

    private boolean isCorrectLetter(int position, String attempt){
        return this.correct.charAt(position) == attempt.charAt(position);
    }

    private boolean isPartiallyCorrect(char c){
        return correct.indexOf(c) != -1;
    }
}