public class MusicPlayer{
  //define function
  public static void playMusic(){
    boolean playButton=true;
    if (playButton){
      System.out.println("Music is playing...");
    }else{
      System.out.println("Music is paused...");
    }
  }
  public static void showLyrics(){
    System.out.println("These are the lyrics to the song!");
    System.out.println("These are the lyrics to the song!");
    System.out.println("These are the lyrics to the song!");
    System.out.println("These are the lyrics to the song!");
  }
  public static void songName(String songTitle){
    System.out.println("Song Name: " +songTitle);
  }

  public static void main(String[] args) {
    //call function
    playMusic();
    showLyrics();
    songName("Song of Avalor");
  }
}
