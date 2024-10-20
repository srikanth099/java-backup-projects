package one;

public class two2 {
	public static void main(String[] args) {
		int n=20;
		int primecount=1;
		int x=2;
		while(primecount<=n) {
			int count=0;
			for(int a=1;a<=n;a++) {
				if(x%a==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(x);
				primecount++;
			}
			x++;
		}
	}

}
