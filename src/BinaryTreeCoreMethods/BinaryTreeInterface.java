package BinaryTreeCoreMethods;

import java.util.List;

public interface BinaryTreeInterface<T> {

	void insertion(T data , int capacity);
	
	List<T> traversalPreOrder(List<T> list, Node<T> node);
	
	List<T> traversalInOrder(List<T> list, Node<T> node);
	
	List<T> traversalPostOrder(List<T> list, Node<T> node);
	

	void traversalHelper();

	

	int height(Node<T> node);
}
