package BınaryTree_LevelOrder_Insertıon;

public class BınaryTree<T> implements BınaryTree_Interface<T> {

	Node<T> root;

	public BınaryTree() {
		this.root = null;
	}


	@Override
	public void insertıon(T data  , int capacity) {
		// TODO Auto-generated method stub

		Node<T> MyNewNode = new Node<>(data);
		
	

		if (root == null) {
			this.root = MyNewNode;
			return;
		}

		Queue<Node<T>> queue = new Queue<>(capacity);

		queue.enqueue(root);
		
		Node<T> pointer = queue.dequeue();
		
		while(queue.size != 0) {
			
			if(pointer.left == null) {
				pointer.left = MyNewNode;
			}else {
				queue.enqueue(pointer.left);
			}
			
			if(pointer.right == null) {
				pointer.right = MyNewNode;
				
			}else {
				queue.enqueue(pointer.right);
			}

		}
		}
			
		
		

	@Override
	public int getHeight(Node<T> treeNode) {
		// TODO Auto-generated method stub
		
		
		if(treeNode == null) {
			return -1;
		}
		
		int leftHeight = getHeight (treeNode.left);
		
		int rightHeight = getHeight (treeNode.right);
		
		if(leftHeight > rightHeight) {
			return leftHeight + 1;
		}else {
			return rightHeight + 1;
		}
		
		
	}

}
