package MiniProject;

public class Question {

  private String answer;
  private String input;
  private String previousResult;
  private String result;
  private boolean match;
  private boolean correct;

  public Question(String answer, String input, String previousResult) {
    this.answer = answer;
    this.input = input;
    this.previousResult = previousResult;
    this.setStatus();
  }

  public String getResult() {
    return result;
  }

  public boolean isMatch() {
    return match;
  }

  public boolean isCorrect() {
    return correct;
  }

  public void setStatus() {
    this.result = "";
    this.match = false;
    this.correct = false;

    int start = 0;
    int end = answer.indexOf(input);
    while (0 <= end) {
      this.match = true;
      this.result += previousResult.substring(start, end);
      this.result += answer.substring(end, end+1);
      start = end+1;
      end = answer.indexOf(input, end+1);
    }
    this.result += previousResult.substring(start);

    if (this.result.equals(answer)) this.correct = true;
  }

  public void printResult(){
    System.out.println(String.format("You are guessing: %s", result));
  }

}
