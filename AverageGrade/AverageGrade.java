public class AverageGrade{
  public static void main(String[] args) {
    double maths = 97.5;
    double english = 77.5;
    double art = 65.5;
    double science = 93.5;
    double drama = 94.5;
    double sum = maths+english+art+science+drama;
    double average = sum/5;

    System.out.println("Average score is " + average);
  }
}
