package in.prec.logicalprograms.primenumber.perfectnumber;

public class PerfectNumber {
	int number;
	
	public PerfectNumber() {}
	
	public PerfectNumber(int number) {
		this.number=number;
	}
	
	public void setNumber(int numberr) {
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean isPerfectNumber() {
		int sum=0;
		for(int i=1;i<=number/2;i++)
			if(number%i==0)
				sum+=i;
		//if(sum==number)
			//return true;
		//else
			//return false;
		
		//return(sum==number)?true:false;
		return(sum==number);
	}

}
