package com.csc;

public class OakTree {
  private Node root;
  
  private Node current;
  
  public OakTree() {
    this.root = new Node(new Squirrel("Root"));
    this.current = this.root;
  }
  
  // returns true if traversing was successful
  public boolean left() {
    if(this.current.left() == null) {
      return false;
    }
    
    this.current = this.current.left();
    return true;
  }
  
  // returns true if traversing was successful
  public boolean right() {
    if(this.current.right() == null) {
      return false;
    }
    
    this.current = this.current.right();
    return true;
  }
  
  public Node get_current_node() {
    return this.current;
  }
  
  public void addLeftNode(Node child) {
    this.current.set_left(child);
  }
  
  public void addRightNode(Node child) {
    this.current.set_right(child);
  }
  
  public static void main(String[] args) {
    System.out.println("Oak Tree!!!");
  }
}
