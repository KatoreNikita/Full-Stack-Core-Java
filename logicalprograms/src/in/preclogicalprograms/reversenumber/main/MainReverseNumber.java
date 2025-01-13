package in.preclogicalprograms.reversenumber.main;
import in.preclogicalprograms.reversenumber.ReverseNumber;

public class MainReverseNumber {
	public static void main(String[] args) {
		ReverseNumber number=new ReverseNumber();
		int variable=435;
		number.setNumber(variable);
		int result=number.reverseNumber();
		
		if(number.isPallindrome()) 
			System.out.println(variable+ " is a Pallindrome Number ");
		else
			System.out.println(variable + " is not a Pallindrome Number ");
	}
	

}
