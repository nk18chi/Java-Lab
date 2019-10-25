package PigLatin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestGameController {

  @Parameterized.Parameters(name = "{index}: @GameController.setOutput()")
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        {new GameController("ham"), "hijamon"},
        {new GameController("joy"), "jikoyuz"},
        {new GameController("joz"), "jikozuz"},
        {new GameController("aaa"), "aaa"}
    });
  }

  @Parameterized.Parameter
  public GameController inputs;

  @Parameterized.Parameter(1)
  public String expected;

  @Test
  public void testSetOutput() {
    Assert.assertEquals(expected, inputs.getOutput());
  }

}
