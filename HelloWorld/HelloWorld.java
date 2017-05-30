public class  HelloWorld{
    public static void main(String[] args) {
      System.out.println("Java Rocks!");

      // variables
      int passengers; //declare variable
      int stops;
      String driver;
      passengers = 0; //set variable value
      passengers = passengers + 5; //assigning new value to variable
      stops = 1;
      passengers = passengers - 3;
      stops = stops + 1;
      passengers = passengers - 1 + 5;
      stops = stops + 1;

      driver = "Wamari"; //declare string variable
      //count number of letters in the string
      int xters = driver.length();

      driver = driver.toUpperCase(); //convert to uppercase

      System.out.println("We have " + passengers + " passengers");
      System.out.println("You have made " + stops + " stops!");
      System.out.println(driver + " has " + xters +" in his name");
      System.out.println(driver);
    }
  }
