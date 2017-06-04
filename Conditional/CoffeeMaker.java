//switch staments
public class CoffeeMaker{
  public static void main(String[] args) {
    int passcode=729;
    String coffeeType;

    switch(passcode){
      case 555: coffeeType = "Espresso";
        break;
      case 312: coffeeType = "Vanilla Latte";
        break;
      case 629: coffeeType = "Drip Coffee";
        break;
      default: coffeeType = "Unknown";
        break;
    }
    System.out.println(coffeeType);
  }
}
