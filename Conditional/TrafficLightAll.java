public class  TrafficLightAll{
  public static void main(String[] args) {
    boolean isLightGreen=false;
    boolean isLightYellow=true;

    //check if light is green
    if(isLightGreen){
      System.out.println("Drive!");
    }else if(isLightYellow) {
      //light is not green
      System.out.println("Slow Down!");
    }else{
      System.out.println("Stop!");
    }
  }
}
