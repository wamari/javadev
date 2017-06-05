public class Alarms{
  public boolean checkAlarm(){

  }
  public void beep(){
    System.out.println("Beeping");
  }
  public void alarm(){
    boolean on = checkAlarm();
    //while loop
    while(on){
      beep();
      on = checkAlarm();
    }
  }
}
