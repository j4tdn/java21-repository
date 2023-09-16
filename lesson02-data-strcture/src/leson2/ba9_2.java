package leson2;

public class ba9_2 {
	public static boolean checkPrime(int n) {
		for (int i = 3; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

public static void main(String[] args) {
	int n=0;
	int i=3;
	while(n!=200) {
		if(checkPrime(i)) n++;
			i=i+1;
	}
	System.out.println(i-1);
}
}
