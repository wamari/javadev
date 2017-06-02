public class AutomatedDiscount{
  public static void main(String[] args) {
    int ticketPrice=10;
    int age=10;
    boolean isStudent=false;

  /*  if(age <= 15){
      ticketPrice = 5;
    }else if(age > 60){
      ticketPrice = 5;
    }else if(isStudent){
      ticketPrice = 5;
    } */

    if(age<=15 || age >60 || isStudent){
      ticketPrice=5;
    }

    System.out.println(ticketPrice);
  }
}
