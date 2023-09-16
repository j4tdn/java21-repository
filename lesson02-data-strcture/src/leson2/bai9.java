package leson2;

import java.util.ArrayList;
import java.util.List;

public class bai9 {
	public static List<Integer> findPrime(int n){
		boolean[] arr = new boolean[n+1];
		List<Integer> primes =new ArrayList<>();
		for (int i=2;i<=n;i++) {
			arr[i]= true;
		}
		for(int i=2;i*i<n;i++) {
			if(arr[i]) {
				for (int j=i*i;j<=n;j=j+i) {
					arr[j]=false;
				}
			}
		}
		for (int i=2;i<=n;i++) {
			if(arr[i]) {
				primes.add(i);
			}
		}
		return primes;
	}
public static void main(String[] args) {
	int n=10;
	List<Integer> primes = findPrime(n);
	for (int prime : primes) {
        System.out.print(prime + " ");
    }
	//System.out.println(primes);
}
}
