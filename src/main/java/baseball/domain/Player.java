package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> playerAnswer = new ArrayList<>();

    public Player(List<Integer> playerAnswer) {
        this.playerAnswer = playerAnswer;
    }

    public List<Integer> getPlayerAnswer() {
        return playerAnswer;
    }

    public void setPlayerAnswer(List<Integer> playerAnswer) {
        this.playerAnswer = playerAnswer;
    }
}
