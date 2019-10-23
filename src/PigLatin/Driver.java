package MiniProject;

public class Driver {
  public static void main(String[] args) {
    GameController game = new GameController();
//    System.out.println(game.getAnswer());
    while (game.getMissingCount() < game.REMAIN_COUNT ) {
      Input i = new Input(game.getInputHistory());
      game.addInputHistory(i.getInput());

      Question q = new Question(game.getAnswer(), i.getInput(), game.getCurrentResult());
      q.printResult();
      if (!q.isMatch()) {
        game.addInputWrongHistory(i.getInput());
        game.addMissingCount();
      }

      if (q.isCorrect()) break;

      game.printMissingCount();
      game.setCurrentResult(q.getResult());
      game.setInputHistory(game.getInputHistory());
      game.setInputWrongHistory(game.getInputWrongHistory());
    }

    if (game.getMissingCount() == 10) {
      game.printEndFailureStatement();
    } else {
      game.printEndSuccessStatement();
    }
  }
}
