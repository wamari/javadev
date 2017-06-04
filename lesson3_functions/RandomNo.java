//program to simulate dice roll
public class RandomNo{
  public static int rollDice(){
    //random number ntwn 0 to almost 1
    double randomNumber = Math.random(); //generate a random number including 0 but not 1
    //change random number to btwn 0 to almost 6
    randomNumber = randomNumber * 6;
    //shift range up plus one
    randomNumber = randomNumber + 1;
    //cast decimal value to integer by dropping numbers after decimal
    int randomInt = (int) randomNumber;
    return randomInt;
  }
  public static void main(String[] args) {
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println("Roll 1: " + roll1);
    System.out.println("Roll 2: " + roll2);
    System.out.println("Roll 3: " + roll3);
  }
}
