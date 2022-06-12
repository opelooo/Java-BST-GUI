package AVL_Tree;

import java.util.ArrayList;

/**
 *
 * @author Mathys
 */
public class datPohon {

      private AVLTree<String> pohon = new AVLTree<>();
      private int index = 1;

      public datPohon() {
	    pohon.clear();
	    pohon.getPostorder().clear();
	    pohon.getPreorder().clear();
	    pohon.getInorder().clear();
      }

      public void fillData() {
	    pohon.add("Hujan");
	    pohon.add("Entrok");
	    pohon.add("Rindu");
	    pohon.add("Dear John");
	    pohon.add("Ranah 3 Warna");
	    pohon.add("99 Cahaya di Langit Eropa: Perjalanan Menapak Jejak Islam di Eropa");
	    pohon.add("Surat Kecil Untuk Tuhan");
	    pohon.add("The Fault in Our Stars");
	    pohon.add("Surat Panjang Tentang Jarak Kita yang Jutaan Tahun Cahaya");
	    pohon.add("Sepotong Senja untuk Pacarku");
	    pohon.add("The Lovely Bones");
	    pohon.add("What We Talk About When We Talk About Love");
	    pohon.add("Seperti Dendam, Rindu Harus Dibayar Tuntas");
	    pohon.add("Dear Nathan");
	    pohon.add("Daun Yang Jatuh Tak Pernah Membenci Angin");
	    pohon.add("P.S. I Still Love You (To All the Boys I've Loved Before, #2)");
	    pohon.add("9 Summers 10 Autumns");
	    pohon.add("Negeri 5 Menara");
	    pohon.add("Rantau 1 Muara");
	    pohon.add("Hateship, Friendship, Courtship, Loveship, Marriage: Stories");
	    pohon.add("O");
	    pohon.add("The Madness of Lord Ian Mackenzie (Mackenzies & McBrides, #1)");
	    pohon.add("Anna Dressed in Blood (Anna, #1)");
	    refreshData();
      }

      public AVLTree<String> getPohon() {
	    return pohon;
      }

      public ArrayList<String> getInorder() {
	    return pohon.getInorder();
      }

      public ArrayList<String> getPostorder() {
	    return pohon.getPostorder();
      }

      public ArrayList<String> getPreorder() {
	    return pohon.getPreorder();
      }

      public void refreshData() {
	    pohon.getPostorder().clear();
	    pohon.getPreorder().clear();
	    pohon.getInorder().clear();
	    pohon.postorder();
	    pohon.preorder();
	    pohon.inorder();
      }

      public boolean cari(Object e) {
	    ArrayList<String> bookList = getInorder();

	    index = 1;
	    for (String book : bookList) {
		  if (e.equals(book)) {
			return true;
		  }
		  index++;
	    }
	    return false;
      }

      public int getIndexBuku() {
	    return index;
      }
}
