public class Question7{
  public static double fahrenheightToCelcius(double fahrenheight){
      return (fahrenheight -32) * 5/9;
  }
  public static void printTemperature(double fahrenheight){
    System.out.println("F: " + fahrenheight);
    System.out.println("C: " +fahrenheightToCelcius(fahrenheight));
  }
  public static void main(String[] args) {
      printTemperature(95);
  }
}
