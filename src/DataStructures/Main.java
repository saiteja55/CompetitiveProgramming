import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    Map<Integer, Long> map = new HashMap<>();
    Long aLong = Long.valueOf(map.get(1) == null ? -1 : map.get(1));
    System.out.println(aLong);
  }
}
