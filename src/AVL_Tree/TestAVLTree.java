package AVL_Tree;



public class TestAVLTree {

	public static void main(String[] args) {
		// Create an AVL tree
		datPohon dP= new datPohon();
		AVLTree<String> tree = dP.getPohon();
		dP.fillData();

		printTree(tree);
		
		String dicari = "Entrok";
		if (tree.search(dicari)) {
			System.out.println("\nAda");
			tree.printTreeKe(dicari);
			System.out.printf("%s di index ke %s\n",tree.getNamaBukuDicari(), tree.getIndexKe());
		}

	}

	public static void printTree(BST tree) {
		// Traverse tree
		System.out.print("inorder (sorted): ");
		tree.inorder();
		System.out.print("\n\npostorder: ");
		tree.getPostorder().forEach((t) -> {System.out.print(t + " ");});
		System.out.print("\n\npreorder: ");
		tree.preorder();
		System.out.print("\n\nThe number of nodes is " + tree.getSize());
		System.out.println();
	}
}
