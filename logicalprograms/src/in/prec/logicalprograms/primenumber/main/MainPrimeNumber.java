package in.prec.logicalprograms.primenumber.main;

import in.prec.logicalprograms.primenumber.PrimeNumber;

public class MainPrimeNumber {
	public static void main(String[] args) {
		PrimeNumber number=new PrimeNumber();
		int variable=10;
		number.setNumber(variable);
		if(number.isPrimeNumber())
			System.out.println(variable + " is a Prime number");
		else
			System.out.println(variable + " is not a Prime number");
	
	}
	
}
