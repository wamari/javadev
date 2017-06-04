//program to simulate dice roll with dice of different sides i.e 6, 8 or 10
public class DiceRoll{
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
  public static void main(String[] args) {
    //call function with parameter sides
    int roll1 = rollDice(6);
    int roll2 = rollDice(8);
    int roll3 = rollDice(10);

    System.out.println("6 Roll 1: " + roll1);
    System.out.println("8 Roll 2: " + roll2);
    System.out.println("10 Roll 3: " + roll3);
  }
}
