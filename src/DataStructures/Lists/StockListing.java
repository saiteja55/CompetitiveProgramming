package Lists;

import java.util.*;

/**
 * Created by Saiteja on 2019-07-06
 */
public class StockListing {

  private static Comparator<Stock> order = Comparator.comparing(Stock::getPrice);

  public static void main(String[] args) {
    Stock stock = new Stock();
    stock.setName("MODN");
    stock.setPrice(200.56);
    Stock stock1 = new Stock();
    stock1.setName("APL");
    stock1.setPrice(200.56);
    Stock stock2 = new Stock();
    stock2.setName("NASDAQ");
    stock2.setPrice(3000.56);
    Stock stock3 = new Stock();
    stock3.setName("GOGL");
    stock3.setPrice(500.56);
    LinkedList<Stock> linkedList = new LinkedList<>(Arrays.asList(stock, stock1, stock2, stock3));
    System.out.println("Before sort");
    Iterator<Stock> iterator = linkedList.iterator();
    while (iterator.hasNext()) {
      Stock next = iterator.next();
      System.out.println(next.getName() + "=>" + next.getPrice());
    }
    linkedList.sort(order);
    System.out.println("After sort");
    iterator = linkedList.iterator();
    while (iterator.hasNext()) {
      Stock next = iterator.next();
      System.out.println(next.getName() + "=>" + next.getPrice());
    }
  }
}

class Stock {
  private String name;
  private double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
