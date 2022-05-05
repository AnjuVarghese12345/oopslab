import java.util.Arrays;

public class sortArr
{
  public static void main(String[] args)
  {
    String[] fruits = {"banana", "orange", "kiwi", "apple"};
    Arrays.sort(fruits);
    for (String fruit : fruits)
    {
      System.out.println(fruit);
    }
  }
}
