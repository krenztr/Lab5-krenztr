import java.util.ArrayList;


public class PrimeNumberGenerator {
	public static ArrayList<Integer> generatePrimes(int n){
		if(n < 3)
			return new ArrayList<Integer>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 2; i < n; i++){
			ArrayList<Integer> primeFactors = PrimeFactorization.primeFactors(i);
			if(primeFactors.get(primeFactors.size()-1) == i)
				ret.add(i);
		}
		return ret;
	}
}
