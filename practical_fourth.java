package advjava;

public class practical_fourth {

	public static void main(String[] args) {
		int n=3;
		int m=5;
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1||i==n||j==1||j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
