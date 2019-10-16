/**
 * Model is abstract base class for test model of understanding how to run on Java by using class.
 * A Model object encapsulates the state information needed for the various rendering operations
 * that Java supports.  This state information includes:
 *
 * <ul>
 * <li>The current first name
 * <li>The current last name
 * <li>The current height(inches)
 * <li>The current weight(double)
 * <li>The current can travel (boolean)
 * <li>The current smokes (boolean)
 * </ul>
 *
 * @author  Naoki Mita
 * @version %I%, %G%
 * @since   1.0
 */

package Lab1;

public class Model {

  public static final int INCHES_PER_FOOT = 12;
  public static final double POUNDS_PER_KG = 2.2046;
  public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
  public static final int TALL_INCHES = 67;
  public static final double THIN_POUNDS = 140.0;
  public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
  public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
  public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

  private String first_name = null;
  private String last_name = null;
  private int height = 0;
  private double weight = 0.0;
  private boolean can_travel = true;
  private boolean smokes = false;

  public Model() {
    /**
     * all fields set above default values;
     * @param None
     */
    this.first_name = first_name;
    this.last_name = last_name;
    this.height = height;
    this.weight = weight;
    this.can_travel = can_travel;
    this.smokes = smokes;
  }


  public Model(String first_name, String last_name, int height, double weight) {
    /**
     * each parameter set values but can travel and smokes set default values.
     * @param first_name   given name, String
     * @param last_name    family name, String
     * @param height       measured in inches, integer
     * @param weight       measured in pounds, double
     */
    this.setFirstName(first_name);
    this.setLastName(last_name);
    this.setHeight(height);
    this.setweight(weight);
    this.can_travel = can_travel;
    this.smokes = smokes;
  }

  public Model(String first_name, String last_name, int height, double weight, boolean can_travel, boolean smokes) {
    /**
     * all parameter set values
     * @param first_name   given name, String
     * @param last_name    family name, String
     * @param height       measured in inches, integer
     * @param weight       measured in pounds, double
     * @param can_travel   whether can travel or not, boolean
     * @param smokes       whether smoke or not, boolean
     */
    this.setFirstName(first_name);
    this.setLastName(last_name);
    this.setHeight(height);
    this.setweight(weight);
    this.setCanTravel(can_travel);
    this.setSmokes(smokes);
  }

  public boolean checkLength(String t, int start, int end) {
    /**
     * @param t       target text for counting letters
     * @param start   at the beginning of number for checking count
     * @param end     at the end of number for checking count
     */
    return start <= t.length() && t.length() <= end;
  }

  public boolean checkNumber(int n, int start, int end) {
    /**
     * @param t       target number for checking whether the number is between target numbers
     * @param start   at the beginning of number for checking
     * @param end     at the end of number for checking
     */
    return start <= n && n <= end;
  }

  public void setFirstName(String first_name) {
    /**
     * @param first_name   the letters of this name have to be from 3 to 20.
     *                     if not, the values is not stored.
     */
    this.first_name = checkLength(first_name, 3, 20) ? first_name : null;
  }

  public void setLastName(String last_name) {
    /**
     * @param first_name   the letters of this name have to be from 3 to 20.
     *                     if not, the values is not stored.
     */
    this.last_name = checkLength(last_name,3, 20) ? last_name : null;
  }

  public void setHeight(int inches) {
    /**
     * @param inches   this number have to be from 24 to 84. if not, the value is 0.
     */
    this.height = checkNumber(inches, 24, 84) ? inches: 0;
  }

  public void setHeight(int feet, int inches) {
    /**
     * if setHeight has two arguments and argument type is appropriate, feet change to inches,
     * which means the value become inches.
     * @param feet     integer
     * @param inches   integer
     */
    int i;
    i = feet * INCHES_PER_FOOT + inches;
    this.setHeight(i);
  }

  public void setweight(double pounds) {
    /**
     * @param pounds  the number have to be from 80 to 280. if not, the number is 0.0.
     */
    this.weight = checkNumber((int) pounds, 80, 280) ? pounds: 0.0;
  }

  public void setweight(long kilograms) {
    /**
     * @param kilograms  if the value is long type, program consider this number kilogram.
     *                   And this number calculate from kilogram to pounds.
     */
    double p;
    p = kilograms * POUNDS_PER_KG;
    this.setweight(p);
  }


  public void setCanTravel(boolean can_travel) {
    /**
     * @param can_travel
     */
    this.can_travel = can_travel;
  }

  public void setSmokes(boolean smokes) {
    /**
     * @param smokes
     */
    this.smokes = smokes;
  }

  public String getFirstName() {
    /**
     * @return first_name
     */
    return first_name;
  }

  public String getLastName() {
    /**
     * @return last_name
     */

    return last_name;
  }

  public int getHeight() {
    /**
     * @return height
     */
    return height;
  }

  public double getweight() {
    /**
     * @return weight
     */
    return weight;
  }

  public String getHeightInFeetAndInches() {
    /**
     * @return text which shows feet and inches from the data of inches.
     */
    int h = getHeight();
    String t = "";

    t += h == 0 ? "0 feet" : "";

    // calculate feet
    if (0 < h / INCHES_PER_FOOT) {
      t += String.format("%s feet", h / INCHES_PER_FOOT);
      h -= h / INCHES_PER_FOOT * INCHES_PER_FOOT;
    }

    // calculate inch
    if(h == 1) {
      t += String.format(" %s inch", h);
    } else if (0 < h) {
      t += String.format(" %s inches", h);
    }

    return t;
  }

  public long getWeightKg() {
    /**
     * @return kilograms by changing from pounds to kilograms.
     */
    long kg;
    double w = getweight();
    kg = Math.round(w / POUNDS_PER_KG);

    return kg;
  }

  public boolean isCanTravel() {
    /**
     * @return can_travel
     */
    return can_travel;
  }

  public boolean isSmokes() {
    /**
     * @return smokes
     */
    return smokes;
  }

  public void printDetails() {
    /**
     * print the component of detail
     */
    System.out.println(String.format("Name: %s %s", getFirstName(), getLastName()));
    System.out.println(String.format("Height: %s inches", getHeight()));
    System.out.println(String.format("Weight: %.0f pounds", getweight()));

    String boolean_travel = isCanTravel() ? "travel" : "not travel";
    System.out.println(String.format("Does %s", boolean_travel));

    String boolean_smoke = isSmokes() ? "smoke" : "not smoke";
    System.out.println(String.format("Does %s", boolean_smoke));
  }

  public int calculatePayDollarsPerHour() {
    /**
     * @return dollars per hour by depending on the data of component.
     */
    int rate = BASE_RATE_DOLLARS_PER_HOUR;

    rate += TALL_INCHES <= getHeight() && getweight() < THIN_POUNDS ? TALL_THIN_BONUS_DOLLARS_PER_HOUR : 0;
    rate += isCanTravel() ? TRAVEL_BONUS_DOLLARS_PER_HOUR : 0;
    rate -= isSmokes() ? 0 : SMOKER_DEDUCTION_DOLLARS_PER_HOUR;

    return rate;
  }

  public void displayModelDetails() {
    /**
     * print the component of detail including feet and hour rate data.
     */
    System.out.println(String.format("Name: %s %s", getFirstName(), getLastName()));
    System.out.println(String.format("Height: %s", getHeightInFeetAndInches()));
    System.out.println(String.format("Weight: %s pounds", getweight()));

    String boolean_travel = isCanTravel() ? "yep" : "nope";
    System.out.println(String.format("Travels: %s", boolean_travel));
    String boolean_smoke = isSmokes() ? "yep" : "nope";
    System.out.println(String.format("Smokes: %s", boolean_smoke));
    System.out.println(String.format("Hourly rate: $%s", calculatePayDollarsPerHour()));
  }

}
