package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Saiteja on 2019-07-07
 */
public class TreeExamples {

  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(5);
    tree.root.right.left = new TreeNode(6);
    tree.root.right.right = new TreeNode(7);

    System.out.println("Inorder Traversal");
    tree.printInOrder();
    System.out.println("\nLevel order traversal");
    tree.doLevelOrder();
    System.out.println("\n");
  }

}

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }
}

class Tree {
  public TreeNode root;

  public void printInOrder() {
    if (root == null) {
      return;
    }
    doInOrderTraversal(root);
  }

  private void doInOrderTraversal(TreeNode node) {
    if (node == null)
      return;
    doInOrderTraversal(node.left);
    System.out.print(node.data);
    doInOrderTraversal(node.right);
  }

  public void doLevelOrder() {
    if (root == null)
      return;
    doLevelOrderTraversal(root);
  }

  private void doLevelOrderTraversal(TreeNode node) {
    if (node == null)
      return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      TreeNode currNode = queue.peek();
      queue.remove();
      System.out.print(currNode.data);
      if (currNode.left != null)
        queue.add(currNode.left);
      if (currNode.right != null)
        queue.add(currNode.right);
    }
  }
}
