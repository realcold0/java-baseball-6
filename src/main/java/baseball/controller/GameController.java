package baseball.controller;

import baseball.domain.AnswerCreator;
import baseball.domain.Player;
import baseball.service.CompareAnswerWithPlayerNumber;
import baseball.view.InputView;

public class GameController {
    private AnswerCreator answerCreator = new AnswerCreator();
    private Player player = new Player();
    private InputView inputView = new InputView();
    private CompareAnswerWithPlayerNumber compareAnswerWithPlayerNumber = new CompareAnswerWithPlayerNumber();

    public void startGame() {
        answerCreator.setComputerAnswer();  //게임 정답 세팅
        player.setPlayerAnswer(inputView.inputPlayerNumbers());//플레이어의 정답 작성
        compareAnswerWithPlayerNumber.compareStrikeBall(player.getPlayerAnswer(),
                answerCreator.getComputerAnswer());//플레이어 정답, 게임정답 비교
        //게임 결과 확인

    }


}
