package BinaryTreeCoreMethods;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> implements BinaryTreeInterface<T> {
	
	Node<T> root;
	
	
	
	public BinaryTree() {
		this.root = null;
		
	}

	@Override
	public void insertion(T data , int capacity) {
		// TODO Auto-generated method stub
		
		Node<T> myNewNode = new Node<>(data);
		
		MyQueue<Node<T>> queue = new MyQueue<>(capacity);
		
		
		if(root == null) {
			root = myNewNode;
			return;
		}
		
		queue.enqueue(root);
		
	
		
		while(queue.size != 0) {
			
			Node<T> pointer = queue.dequeue();
			
			if(pointer.left == null) {
				
				pointer.left = myNewNode;
				return;
			}else {
			    queue.enqueue(pointer.left);
			}
			
			if(pointer.right == null) {
				pointer.right = myNewNode;
				return;
			}else {
				queue.enqueue(pointer.right);
			}
		}
	
		
	}
	

	@Override
	public void traversalHelper() {
		// TODO Auto-generated method stub
		
		List<T> arrayList = new ArrayList<>();
		
		
		traversalInOrder(arrayList , root);
		
		traversalPreOrder(arrayList , root);
		
		traversalPostOrder(arrayList , root);
		
		
		
	}

	@Override
	public List<T> traversalPreOrder(List<T> list, Node<T> node) {
		// TODO Auto-generated method stub
		
		if(node == null) {
			return null;
		}
		
		list.add(node.data);
		traversalPreOrder(list, node.left);
		traversalPreOrder(list, node.right);
		
		return list;
		
	}

	@Override
	public List<T> traversalInOrder(List<T> list, Node<T> node) {
		// TODO Auto-generated method stub
		
		if(node == null) {
			return null;
		}
		

		traversalInOrder(list , node.left);
		
		list.add(node.data);
		
		traversalInOrder(list , node.right);
		
		return list;
		
	}

	@Override
	public List<T> traversalPostOrder(List<T> list, Node<T> node) {
		// TODO Auto-generated method stub
		
		
		if(node == null) {
			return null;
		}
		

		traversalPostOrder(list , node.left);
		
		list.add(node.data);
		
		traversalPostOrder(list , node.right);
		
		return list;
	}


	@Override
	public int height(Node<T> node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return 0;
		}
		
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		if(rightHeight > leftHeight) {
			rightHeight = rightHeight +1;
			return rightHeight;
		}else {
			leftHeight = leftHeight +1;
			return leftHeight;
		}
		
	}


}
