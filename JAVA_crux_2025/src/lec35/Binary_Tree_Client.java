package lec35;

public class Binary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree(); // jdo binary tree da object bnya hoega te by default create tree da method
											// chalega jo ki
											// ehde class andar likhya hoya
		bt.Display();
		// Input for display
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		// input apa sari kathi paste krni aa console ch Create binary tree ape ik ik
		// krke input pick kri jayega
		
		
		System.out.println(bt.find(80));
		System.out.println(bt.max());
		System.out.println(bt.min());
		bt.PreOrder();
		bt.PostOrder();
		bt.InOrder();
		bt.levelOrder();
	}

}
