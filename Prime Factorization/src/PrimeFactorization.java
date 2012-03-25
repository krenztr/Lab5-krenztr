import java.util.ArrayList;

public class PrimeFactorization {
	public static ArrayList<Integer> primeFactors(int number){
		if (number == 1){
			return new ArrayList<Integer>();
		}else{
			int n = number; 
			ArrayList<Integer> factors = new ArrayList<Integer>();
			
			for (int i = 2; i <= n; i++) {
				while (n % i == 0) {
					factors.add(i);
					n /= i;
				}
			}
			
			return factors;
		}
	}
}
