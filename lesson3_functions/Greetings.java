public class Greetings{
  //define our fucntion
  public static void greetingLocation(String location){ //pass the variable location
    System.out.println("Hello, " + location); //print location
  }
  public static void main(String[] args) {
    //call the function
    greetingLocation("Nairobi"); //pass the string variable
    greetingLocation("Nakuru");
    greetingLocation("Kisumu");
  }
}
