package BinaryTreeConstructorBasedInsertıon;

public class Main {
	
	public static void main (String[] args) {
		MyBinaryTree<Integer> tree = new MyBinaryTree<>();
		MyBinaryTree<Integer> built = tree.myTree();
		System.out.println(tree.heightTree(built.root));
	}

}
