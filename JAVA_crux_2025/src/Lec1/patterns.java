package Lec1;

import java.util.*;

public class patterns {

	public static void main(String[] args) {

		// pattern 1

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while (i <= n) {
//			System.out.print("* ");
//			i++;
//				}

		// pattern 2
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star=n;
//		while (row <= n) {
//			//star
//			int i=1;
//			while(i<=star) {
//			System.out.print("* ");
//			i++;
//			}
//			//next line preparation
//			row++;
//			System.out.println();
//		}

//		pattern3
//	Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row=1;
//		int star = row;
//		while (row <= n) {
//			int i = 1;
//			while (i <= star) {
//				System.out.print("* ");
//				i++;
//			}
//			row++;
//		star++;
//			System.out.println();
//		}

//		pattern4
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n ;
//		while(row <=n) {
//			int i =1;
//			while (i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			row++;
//			star--;
//			System.out.println();
//		}

//		pattern5
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1 ;
//		int space = n-1;
//		
//		while(row <=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while (j<= star) {
//				System.out.print("* ");
//				j++;
//			}
//			
//			row++;
//			System.out.println();
//			star++;
//			space--;
//		}

//		 pattern 6
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n ;
//		int space = 0;
//		
//		while(row <=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while (j<= star) {
//				System.out.print("* ");
//				j++;
//			}
//			
//			row++;
//			System.out.println();
//			star--;
//			space++;
//		}

//		pattern 7

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n ;
//		int space = 0;
//		
//		while(row <=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while (j<= star) {
//				System.out.print("* ");
//				j++;
//			}
//			
//			row++;
//			System.out.println();
//			star--;
//			space+=2;
//		}
//		

//		pattern 8
//		Scanner sc = new Scanner(System.in);                                     
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1 ;
//		int space =n+3;
//		
//		while(row <=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while (j<= star) {
//				System.out.print("* ");
//				j++;
//			}
//			
//			row++;
//			System.out.println();
//			star++;
//			space-=2;
//		}

//		pattern 9
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

//		pattern 10
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n+4;
//		int space = 0;
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
//			star-=2;
//			space++;
//		}

//		pattern 11		
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
//				if(j%2==0) {
//				System.out.print("! ");
//				}else {
//					System.out.print("* ");
//				}
//				
//				j++;
//			}
//			row++;
//			System.out.println();
//			star+=2;
//			space--;
//		}

//		pattern12
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//		int space = n - 1;
//		while (row <= n) {
//			int i = 1;
//			while (i <= space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j = 1;
//			while (j <= star) {
//				if (j % 2 == 0) {
//					System.out.print("  ");
//				} else {
//					System.out.print("* ");
//				}
//
//				j++;
//			}
//			row++;
//			System.out.println();
//			star += 2;
//			space--;
//		}

//		pattern 13
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (row == n) {
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			row++;
			System.out.println();
			star++;
			space-=2;
		}

		
//		pattern14
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n;
//		int space = -1;
//		while (row <= n) {
//			int i = 1;
//			
//			while (i <= star) {
//				System.out.print("* ");
//				i++;
//			}
//			int j=1;
//			while (j<=space) {
//				System.out.print("  ");
//				j++;
//			}
//			int k = 1;
//			if (row==1) {
//				k=2;
//			}
//			while (k <= star) {
//				System.out.print("* ");
//				k++;
//			}
//			row++;
//			System.out.println();
//			star--;
//			space+=2;
//		}
		
		
//		pattern 15
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//
//		while (row<=2*n-1) {
//			int i=1;
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			if(row<n) {
//				star++;
//			}else {
//				star--;
//			}
//			row++;
//			System.out.println();
//		}
		
		
//		pattern16
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//
//		while (row<=2*n-1) {
//			int i=1;
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			if(row<n) {
//				star++;
//			}else {
//				star--;
//			}
//			row++;
//			System.out.println();
//		}
		
		
//		pattern 17
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//		int space = n-1;
//
//		while (row<=2*n-1) {
//			int j=1;
//			while(j<=space) {
//				System.out.print("  ");
//				j++;
//			}
//			int i=1;
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			if(row<n) {
//				star++;
//				space--;
//			}else {
//				star--;
//				space++;
//			}
//			row++;
//			
//			System.out.println();
//		}
		
		
//		pattern18
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n;
//		int space = n-1;
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
//			}
//			if(row<n) {
//				star--;
//				space--;
//			}else {
//				star++;
//				space++;
//			}
//			row++;
//			System.out.println();
//		}
		
		
//		pattern 19
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n;
//		int space = 0;
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
//			}
//			if(row<n) {
//				star--;
//				space+=2;
//			}else {
//				star++;
//				space-=2;
//			}
//			row++;
//			System.out.println();
//		}
		
		
//		pattern20
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = 1;
//		int space = n-4;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print("* ");
//				j++;
//			}
//			if(row<n/2+1) {
//				star+=2;
//				space--;
//			}else {
//				star-=2;
//				space++;
//			}
//			row++;
//			System.out.println();
//		}

		
//		pattern 21
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int row = 1;
//		int star = n/2+1;
//		int space = -1;
//		while(row<=n) {			
//			int j=1;
//			while(j<=star) {
//				System.out.print("* ");
//				j++;
//			}
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int k=1;
//			if(row==1||row==n) {
//				k=2;
//			}
//			while(k<=star) {
//				System.out.print("* ");
//				k++;
//			}
//			if(row<n/2+1) {
//				star--;
//				space+=2;
//			}else {
//				star++;
//				space-=2;
//			}
//			row++;
//			System.out.println();
//		}
//		
		
//		pattern 22
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
////		int star=1;
//		int space1=n/2;
//		int space2=-1;
//		while (row<=n) {
////			space
//			int i=1;
//			while(i<=space1) {
//				System.out.print("  ");
//				i++;
//			}
////			single star
//			System.out.print("* ");
////			between Space
//			int k=1;
//			while(k<=space2) {
//				System.out.print("  ");
//				k++;
//				}
//			//again single star
//			if(row>=2&&row<n) {
//			System.out.print("* ");
//			}
////			next row preparation (Mirror)
//			if(row<n/2+1) {
//				space1--;
//				space2+=2;
//			}else {
//				space1++;
//				space2-=2;
//			}
//			row++;
//			System.out.println();
//		}
//		
		
//		pattern 23
//	Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=n;
//		int space1=n-2;
//		while (row<=n) {
//			if(row==1||row==n) {
//				int l=1;
//				while(l<=star) {
//					System.out.print("* ");
//					l++;
//				}
//			}else {
//			System.out.print("* ");
//			
//			int i=1;
//			while(i<=space1) {
//				System.out.print("  ");
//				i++;
//			}
//			System.out.print("* ");	
//			}
//			row++;
//			System.out.println();
//			
//		}
		
		
//	pattern 24	
//		Scanner sc= new Scanner(System.in);
//	int n=sc.nextInt();
//		int row=1;
//		
//		int space1=0;
//		int space2=n-2;
//		while (row<=n) {
////			space
//			int i=1;
//			while(i<=space1) {
//				System.out.print("  ");
//				i++;
//			}
//		//	single star
//			System.out.print("* ");
////			between Space
//			int k=1;
//			while(k<=space2) {
//				System.out.print("  ");
//				k++;
//				}
//			//again single star
//			if(row!=n/2+1) {
//			System.out.print("* ");
//			}
////			next row preparation (Mirror)
//			if(row<n/2+1) {
//				space1++;
//				space2-=2;
//			}else {
//				space1--;
//				space2+=2;
//			}
//			row++;
//			System.out.println();
//		}
		
		
//		pattern 25
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print("1 ");
//				j++;
//			}
//			star+=2;
//			space--;
//			row++;
//			System.out.println();
//		}
		
		
//		pattern26
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print(row+" ");
//				j++;
//			}
//			star+=2;
//			space--;
//			row++;
//			System.out.println();
//		}
		
		
//		pattern 27
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		int val=1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("\t");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print(val +"\t");
//				val++;
//				j++;
//			}
//			star+=2;
//			space--;
//			row++;
//			System.out.println();
//		}
		
		
//	pattern28
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print(j +" ");
//				j++;
//			}
//			star+=2;
//			space--;
//			row++;
//			System.out.println();
//		}
		
		
//		pattern29
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			int val=1;
//			while(j<=star) {
//				System.out.print(val +" ");
//				val++;
//				j++;
//			}
//			star+=2;
//			space--;
//			row++;
//			System.out.println();
//		}
		
		
//		pattern 30
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			int val=1;
//			while(j<=star) {
//				System.out.print(val +" ");
//				if (j<star/2+1) {
//					val++;
//				}else {
//					val--;
//				}
//				j++;
//			}
//			star+=2;
//			space--;
//			row++;
//			System.out.println();
//		}
		
		
//		pattern31
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		int val=1;
//		while(row<=2*n-1) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			int p=val;
//			while(j<=star) {
//				System.out.print(p+" ");
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
//		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
