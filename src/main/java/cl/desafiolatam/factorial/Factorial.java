package cl.desafiolatam.factorial;

public class Factorial {

	public long calcFactorial(int n) {
	  long factorial = 1;
		for(int i = 2; i<= n; i++) {
		factorial *= i;
	}
	return factorial;
	}
}