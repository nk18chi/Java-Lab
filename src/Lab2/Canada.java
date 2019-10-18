package Lab2;

public class Canada {
  private Province[] provinces;

  public Canada() {
    this.provinces = new Province[] {
        new Province("Ontario","Toronto",13448494),
        new Province("Quebec","Quebec City",8164361),
        new Province("British Columbia","Victoria",4648055),
        new Province("Alberta","Edmonton",4067175),
        new Province("Manitoba","Winnipeg",1278365),
        new Province("Saskatchewan","Regina",1098352),
        new Province("Nova Scotia","Halifax",923598),
        new Province("New Brunswick","Fredericton",747101),
        new Province("Newfoundland and Labrador","St.John's",519716),
        new Province("Prince Edward Island","Charlottetown",142907)
    };
  }

  public void displayAllProvinces() {
    for (Province p: this.provinces) {
      System.out.println(p.getDetails());
    }
  }

  public int getNumOfProvincesBetween(int min, int max) {
    int count = 0;
    int million = 0;
    for (Province p : this.provinces) {
      million = (int) p.getPopulation() / 1000000;
      if (1 <= million && million <= 15) count++;
    }
    return count;
  }
}
