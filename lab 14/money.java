public class Money {
  private int dollars
  private int cents;

  public Money () {
    this.dollars = 0;
    this.cents = 0;
  }

  public Money (int dollars, int cents) {
    this.dollars = dollars;
    this.cents = cents;
  }

  public int getDollars () {
    return dollars;
  }

  public int getCents () {
    return cents;
  }

  public String toString () {
    return "$ " + dollars + "." + (cents < 10 ? "0" : "") + cents;
  }

  public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        } else {
            return this.cents - other.cents;
        }
    }

  public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money other = (Money) obj;
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }
}