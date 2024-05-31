import java.util.Arrays;

public class Main1 {
  public static void main(String[] args) {
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    String betterPrintout = Arrays.toString(topics);
    System.out.println(betterPrintout);
  }
}