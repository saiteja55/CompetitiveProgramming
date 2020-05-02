package Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Saiteja on 2019-07-11
 */
public class ListOps {

  public static void main(String[] args) {
    Map<String, Object> map = Collections.emptyMap();
    Set<String> set = map.entrySet().stream().map(value -> value.getKey()).collect(Collectors.toSet());
    if (set.isEmpty()) {
      System.out.println("Empty");
    }
    System.out.println(set.toString());
  }
}


class A {
  static void doThis() {
    System.out.println("Do This called");
  }
}

class B {

  private void doThat() {
    System.out.println("Calling do This");
    A.doThis();
  }

  public static void main(String[] args) {
    B b = new B();
    b.doThat();
  }
}