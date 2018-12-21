//Implementing BFS in a Tree

import java.util.*;
class Node 
{
	int data;
	Node left,right;


	public Node(int item)
	{
	 data = item;
	 left=null;
	 right=null;
	}

}


class BinaryTree
{
	Node root ;

	Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
	while(!queue.isEmpty())
	{
	  Node tempNode = queue.poll();
	  System.out.print(tempNode.data + " ");

	        /*Enqueue left child */
            if (tempNode.left != null)
			{
                queue.add(tempNode.left);
            }
 
            /*Enqueue right child */
            if (tempNode.right != null)
			{
                queue.add(tempNode.right);
            }
	}

}

class BinaryTreeDemo
{
		public static void main(String[] args) 
	{
		Tree tree = new Tree();
	}
}
