//program to simulate dice roll with dice of different sides i.e 6, 8 or 10
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
    //System.out.println("Roll 1: " +roll1);
    //System.out.println("Roll 2: " +roll2);
    //System.out.println("Roll 3: " +roll3);
    //System.out.println("Roll 4: " +roll4);
    monopolyRoll();
  }
}
