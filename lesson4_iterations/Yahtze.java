public class Yahtze{
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

  public static int keepRolling(){
    int dice1 = rollDice();
    int dice2 = rollDice();
    int count = 1;
    while(!(dice1==dice2)){
      dice1 = rollDice();
      dice2 = rollDice();
      count = count + 1;
    }
    System.out.println("Yahtze!!");
    return count;
  }
  public static void main(String[] args) {
    keepRolling();
  }
}
