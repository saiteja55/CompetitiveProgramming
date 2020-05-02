package Lists;

import java.util.*;

/**
 * Created by Saiteja on 2019-07-06
 */
public class LinkedListExamples {

  private static final Scanner scanner = new Scanner(System.in);

  public Node createLinkedList() {
    System.out.println("Enter the number of nodes: ");
    int size = scanner.nextInt();
    if (size == 0) {
      System.out.println("Why did you run me then ? Dumb***");
      return null;
    }
    System.out.println("Enter the data for all nodes");
    Node start = null, prev = null, curr;
    for (int i = 0; i < size; i++) {
      curr = new Node();
      curr.data = scanner.nextInt();
      curr.next = null;
      if (Objects.isNull(start)) {
        curr.prev = null;
        start = curr;
        prev = start;
      } else {
        curr.prev = prev;
        prev.next = curr;
        prev = curr;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    LinkedListExamples linkedListExamples = new LinkedListExamples();
    Node startNode = linkedListExamples.createLinkedList();
    if (Objects.isNull(startNode))
      return;
    printLinkedList(startNode);
    System.out.println("Printing previous nodes");
    Node curr = startNode;
    while (curr.next != null) {
      if (Objects.isNull(curr.prev)) {
        System.out.print("NULL<=");
        curr = curr.next;
        continue;
      }
      System.out.print(curr.prev.data + "<=");
      curr = curr.next;
    }
    System.out.print(curr.prev.data + "\n");
    printLinkedList(reverseLinkedList(startNode));
  }

  private static void printLinkedList(Node startNode) {
    Node curr = startNode;
    System.out.println("Created LinkedList is as below");
    while (curr.next != null) {
      System.out.print(curr.data + "->");
      curr = curr.next;
    }
    System.out.print(curr.data + "\n");
  }

  private static Node reverseLinkedList(Node startNode) {
    if (startNode == null) {
      return null;
    }
    Node curr = startNode;
    Node prev = null;
    while (curr.next != null) {
      Node temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    System.out.println(curr.data);
    curr.next = prev;
    startNode = curr;
    return startNode;
  }
}

class Node {
  int data;
  Node next;
  Node prev;
}
