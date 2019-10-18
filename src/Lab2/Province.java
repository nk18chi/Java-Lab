package Lab2;

public class Province {

  public static final String DEFAULT_PROVINCE = "British Columbia";
  public static final String DEFAULT_CAPITAL = "Victoria";
  public static final int DEFAULT_POPULATION = 4648055;
  public static final String[] CANADA_PROVINCE_DATA = {
      "Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
      "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island"
  };
  public static final String[] CANADA_CAPITAL_DATA = {
      "Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina", "Halifax",
      "Fredericton", "St.John's", "Charlottetown",
  };

  private String name;
  private String capital;
  private long population;

  public Province(String name, String capital, long population) {

    if (isValidPopulation(population) && isValidProvince(name) && isValidCapitalCity(capital)) {
      this.name = name;
      this.capital = capital;
      this.population = population;
    } else {
      this.name = DEFAULT_PROVINCE;
      this.capital = DEFAULT_CAPITAL;
      this.population = DEFAULT_POPULATION;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  private boolean isValidProvince(String name) {
    for (String data :CANADA_PROVINCE_DATA) {
      if (data == name) return true;
    }

    return false;
  }

  private boolean isValidCapitalCity(String capital) {
    for (String data :CANADA_CAPITAL_DATA) {
      if (data == capital) return true;
    }

    return false;
  }

  private boolean isValidPopulation(long population) {
    if( 30000 <= population && population <= 15000000) return true;

    return false;
  }

  public String getDetails() {
    return String.format("The capital of %s (population. %s) is %s."
        ,getName() ,getPopulation(), getCapital()
    );
  }

}
