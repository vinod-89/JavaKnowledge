package com.ds.tree;

class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data=d;
		left=right=null;	
	}
}

public class LevelOrderTraversal {
Node root;   
public static void main(String args[]) 
{ 
	LevelOrderTraversal tree = new LevelOrderTraversal(); 
    tree.root= new Node(1); 
    tree.root.left= new Node(2); 
    tree.root.right= new Node(3); 
    tree.root.left.left= new Node(4); 
    tree.root.left.right= new Node(5); 
      
    System.out.println("Level order traversal of binary tree is "); 
    tree.printLevelOrder(); 
 }
private void printLevelOrder() {
	int h=height(root);
}
private int height(Node root2) {
if(root2==null)
	return 0;
else {

}
return 0;
}

}
