public class TipCalculator{
  public static void main(String[] args) {
    double paid =10;
    double change = 3.25;
    double tip = (paid-change)*0.2; //give 20%
    
    System.out.println("The tip due is Ksh. " + tip);
  }
}
