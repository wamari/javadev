public class WeatherChecker{
  //define function
  public static void WeatherInterpreter(int temp){
    if (temp > 35){
      System.out.println("It's hot outside!");
    } else if (temp < 10){
      System.out.println("It's really cold!");
    }else{
      System.out.println("It's just right!");
    }
  }

  public static void main(String[] args) {
    int degreesC = 2;
    //call our function
    WeatherInterpreter(degreesC);
  }
}
