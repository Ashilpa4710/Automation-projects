package ashil;

public class reverse {
	public static void main(String args[]) {
		int rem,rev=0,n=45678956;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
