public class PhotoLikes{
  public static int likePhoto(int currentLikes, String comment, boolean isLiked){
    //print out comment
    System.out.println("Feedback: " + comment);
    //increase likes
    if (isLiked){
      currentLikes = currentLikes + 1;
    }
    //print out current likes
    //System.out.println("Number of likes: " + currentLikes);
    //return current likes
    return currentLikes;
  }
  public static void main(String[] args) {
    //function call
    int returnedLikes = likePhoto(0, "Awesome Picture", false);
    int totalLikes = likePhoto(returnedLikes, "I like this", true);
    System.out.println("Total Likes: " +totalLikes);
  }
}
