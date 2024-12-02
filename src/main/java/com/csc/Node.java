package com.csc;

public class Node {
  private Squirrel squirrel;
  private Node leftNode;
  private Node rightNode;

  Node(Squirrel squirrel) {
    this.squirrel = squirrel;
    this.leftNode = null;
    this.rightNode = null;
  }
  
  void set_left(Node childNode) {
    this.leftNode = childNode;
  }
  
  void set_right(Node childNode) {
    this.rightNode = childNode;
  }
  
  Node left() {
    return this.leftNode;
  }
  
  Node right() {
    return this.rightNode;
  }
  
  Squirrel get_squirrel() {
    return this.squirrel;
  }
}