//nested if staments
public class Restaurant{
  public static void main(String[] args) {
    int rating=1;

    if (rating>=0 && rating <=5){
      //rating is 0-5
      if (rating<=2){
        //rating is less than or equal to 2
        System.out.println("Why you rate me so low :-(");
      }
      System.out.println("Thank you for your feedback");
    }
  }
}
