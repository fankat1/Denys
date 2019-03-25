
package person.consciousness;

public class Knowledge {

    private int score;

    public Knowledge(int level) {
        this.score = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "score=" + score +
                '}';
    }
}