package BinaryTreeConstructorBasedInsertıon;

public class MyBinaryTree <T> implements MyBinaryTreeInterface<T> {
	
	Node<T> root;
	
	public MyBinaryTree () {
		this.root = null;
	}
	
	public MyBinaryTree(T data){
		
		Node<T> myNewNode = new Node<>(data);
		
		if(root == null) {
			this.root = myNewNode;
		}
		
	}

	public MyBinaryTree(T data , MyBinaryTree<T> left , MyBinaryTree<T> right) {
		
		root = new Node<>(data);
		
		if(left != null) {
			root.left = left.root;
		}else {
			root.left = null;
		}
		
		if(right != null) {
			root.right = right.root;
		}else {
			root.right = null;
		}
		
		
	}

	@Override
	public MyBinaryTree<Integer> myTree() {
		// TODO Auto-generated method stub
		
		MyBinaryTree<Integer> L3 = new MyBinaryTree<> (3);
		MyBinaryTree <Integer> L4 = new MyBinaryTree<> (4);
		MyBinaryTree <Integer> L6 = new MyBinaryTree<> (6);
		MyBinaryTree <Integer> L7 = new MyBinaryTree<> (7);
		
		MyBinaryTree <Integer> connect2 = new MyBinaryTree<>(2 , L3 , L4);
		
		MyBinaryTree <Integer> connect3 = new MyBinaryTree<>(3 , L6 , L7);
		
		
		MyBinaryTree <Integer> connect1 = new MyBinaryTree<>(1 , connect2 , connect3);
		
		return connect1;
	}

	@Override
	public int heightTree(Node<T> myNode) {
		// TODO Auto-generated method stub
		
		if(myNode == null) {
			return 0;
		}
		
		
		int leftHeight = heightTree(myNode.left);
		int rightHeight = heightTree(myNode.right);
		
		int max = Math.max(leftHeight + 1 , rightHeight + 1);
		
		
		return max;
	}

}
