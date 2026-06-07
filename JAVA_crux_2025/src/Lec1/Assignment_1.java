package Lec1;

import java.util.*;

public class Assignment_1 {

	public static void main(String[] args) {

		// question 1 (hollow diamond pattern)
//Scanner sc=new Scanner (System.in);
//int n =sc.nextInt();
//int row=	1;
//int star=n/2+1;
//int space = -1;
//
//while(row<=n) {
//	int i=1;
//	while(i<=star) {
//	System.out.print("* ");
//	i++;
//	}
//	int j=1;
//	while(j<=space) {
//		System.out.print("  ");
//		j++;
//	}
//	int k=1;
//	if(row==1||row==n) {
//		k=2;
//	}
//	while(k<=star) {
//		System.out.print("* ");
//		k++;
//	}
//	if(row<n/2+1) {
//		star--;
//		space+=2;
//	}else {
//		star++;
//		space-=2;
//	}
//	row++;
//	System.out.println();
//}

//		question 2 (triangle pattern)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//		int space = n-1;
//		while (row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while (j<=star) {
//				System.out.print("* ");
//				j++;
//			}
//			row++;
//			System.out.println();
//			star+=2;
//			space--;
//		}

//		question 3 (hollow rhombus pattern)

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row=1;
//		int space=n-1;
//		while (row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			if(row==1||row==n) {
//				int j=1;
//				while(j<=n) {
//					System.out.print("* ");
//					j++;
//				}
//			}
//			else {
//				System.out.print("* ");
//				int j=1;
//				while(j<=n-2) {
//					System.out.print("  ");
//					j++;
//			}
//				System.out.print("* ");
//		}
//		row++;
//		space--;
//		System.out.println();
//		
//		}

//		question 4
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		int val=1;
//		while(row<=2*n-1) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("\t");
//				i++;
//			}
//			int j=1;
//			int p=val;
//			while(j<=star) {
//				System.out.print(p+"\t");
//				if(j<=star/2) {
//					p++;
//				}else {
//					p--;
//				}
//				j++;
//			}
//			if(row<n) {
//				star+=2;
//				space--;
//				val++;
//			}else {
//				star-=2;
//				space++;
//				val--;
//			}
//			
//			row++;
//			
//			System.out.println();
//		}

//	question 5
//		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();
//		int row=1;
//		int star=1;
//		while(row<=n) {
//			int i=1;
//			while(i<=star) {
//				if(i==1||i==star) {
//					System.out.print(row+" ");
//				}else {
//					System.out.print("0 ");
//				}
//				i++;
//			}
//			row++;
//			star++;
//			System.out.println();
//		}

//		question 6(fibonacci pattern)
//		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();
//		int row=1;
//		int star=1;
//		int a=0;
//		int b=1;
//		while(row<=n) {
//			int i=1;
//			while(i<=star) {
//				System.out.print(a+" ");
//				int c=b+a;
//				a=b;
//				b=c;
//				i++;
//			}
//			row++;
//			star++;
//			System.out.println();
//		}

//		question 6 (mirror star pattern)
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		while(row<=2*n-1) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print("* ");
//				j++;
//		}
//			if(row<n) {
//				star+=2;
//				space--;
//				
//			}else {
//				star-=2;
//				space++;
//				
//			}
//			
//			row++;
//		System.out.println();
//		}

//		question 7(pattern number ladder)
//		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();
//		int row=1;
//		int star=1;
//		int val=1;
//		while(row<=n) {
//			int i=1;
//			while(i<=star) {
//				System.out.print(val+"\t");
//				i++;
//				val++;
//			}
//			row++;
//			star++;
//			System.out.println();
//		}

//		question 8(pattern mountain)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//		int space = 2 * n - 3;
//		while (row <= n) {
//			int i = 1;
//			int val = 1;
//			while (i <= star) {
//				System.out.print(val + " ");
//				i++;
//				val++;
//			}
//			int j = 1;
//			while (j <= space) {
//				System.out.print("  ");
//				j++;
//			}
//			int k = 1;
//			val--;
//			if (row == n) {
//				k = 2;
//				val--;
//			}
//			while (k <= star) {
//				System.out.print(val + " ");
//				val--;
//				k++;
//			}
//			row++;
//			star++;
//			space -= 2;
//			System.out.println();
//		}

		
//		question 9(PASCAL TRIANGLE)
 
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 0;
//		int star = 1;
//		while (row<n) {
//			int i=0;
//			int ncr=1;
//			while(i<star) {
//				System.out.print(ncr+" ");
//				ncr=(ncr*(row-i))/(i+1);
//				i++;
//			}
//			row++;
//			star++;
//			System.out.println();
//		}
		
				
//		question 10(double side arrow pattern)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//		int space1=n-1;
//		int space2=-1;
//		int val=1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space1) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			int p=val;
//			while(j<=star) {
//				System.out.print(p+" ");
//				j++;
//				p--;
//		    }
//			int k=1;
//			while(k<=space2) {
//				System.out.print("  ");
//				k++;
//			}
//			int l=1;
//			p=1;
//			if(row==1||row==n) {
//				l=2;
//			}
//			while(l<=star) {
//				System.out.print(p+" ");
//				l++;
//				p++;
//		    }
//			if(row<=n/2) {
//				space1-=2;
//				space2+=2;
//				star++;
//				val++;
//			}else {
//				space1+=2;
//				space2-=2;
//				star--;
//				val--;
//			}
//			row++;
//			System.out.println();
//		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 1;
		while (row <= 2*n+1) {
			int i = 1;
			int val = 5;
			while (i <= star) {
				System.out.print(val + " ");
				i++;
				val--;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			val--;
			if (row == n+1) {
				k = 2;
				val++;
			}
			while (k <= star) {
				System.out.print(val + " ");
				val--;
				k++;
			}
			if(row<=n) {
				star++;
				space -= 2;
			}else {
				star--;
				space += 2;
			}
			row++;
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
