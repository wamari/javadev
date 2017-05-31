public class CastingSample{
    public static void main(String[] args) {
      double curren = 17;
      double rate = 1.5;
      double future = current * rate;
      System.out.println(future);
      int approx = (int) future; //casting future variable to integer value
      System.out.println(approx);
    }
}
