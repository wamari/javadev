public class MusicPlayer{
  //define function
  public static void playMusic(){
    boolean playButton=false;
    if (playButton){
      System.out.println("Music is playing...");
    }else{
      System.out.println("Music is paused...");
    }
  }

  public static void main(String[] args) {
    //call function
    playMusic();
  }
}
