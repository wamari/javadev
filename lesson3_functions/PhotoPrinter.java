public class PhotoPrinter{
  public static void printPhoto(int width, int height, boolean inColor){
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
    if (inColor){
      System.out.println("Print is in full colour.");
    }else{
      System.out.println("Print is in black and white.");
    }
  }
  public static void main(String[] args) {
    //call function
    printPhoto(12, 14, true);
  }
}
