package pregunta3.parcial;

import java.util.HashMap;

public class Combinations {
	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		
		int n = 5;
		Integer acumulador = new Integer(n);
		Integer suma = new Integer(0);
		HashMap<Integer, Integer> map = new HashMap<>();
		System.out.println("# Ladder's steps: " + n);
		//System.out.println("# Step combinations: " + combinations.countCombinationsMejorado(n, 0));
		for (int i= 0;i < n; i++) {
			acumulador = (int) combinations.countCombinationsMejorado(n, i+2);
			suma += acumulador;
		}
		System.out.println("# Step combinations: " + suma);
	}
	
	//Complejidad exponencial

	public long countCombinations(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
				+ countCombinations(n - 3, level + 1);
	}
	//Complejidad lineal
	public long countCombinationsMejorado(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		if (level > n-2) {
			return n;
		}
		return 0;
	}
	
}
