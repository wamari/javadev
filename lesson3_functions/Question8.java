//this program is still not working
public class Question8{
  public static int rollDice(int sides){
    double randomNumber = Math.random();
    //sides = 10;
    randomNumber = randomNumber * sides;
    //shift range up plus one
    randomNumber = randomNumber + 1;
    //cast decimal value to integer by dropping numbers after decimal
    int randomInt = (int) randomNumber;
    return randomInt;
  }
  public static int monopolyRoll(){
    int roll1 = rollDice(6);
    int roll2 = rollDice(6);
    int total = roll1+roll2;

    if (roll1==roll2){
      int roll3 = rollDice(6);
      int roll4 = rollDice(6);
      total = total + roll3 + roll4;
    }
    return total;
  }
  public static void main(String[] args) {
    monopolyRoll();
  }
}
