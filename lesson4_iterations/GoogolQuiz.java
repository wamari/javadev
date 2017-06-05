public class GoogolQuiz{ //1 googol has 101 zeros
  public static void main(String[] args) {
    String googol = "1";
    int len = googol.length();
    while (len<101){
      googol = googol + "0"; //add a zero to the string
      len = googol.length(); //update the len variable
    }
    System.out.println("Googol: " + googol);
  }
}
