package in.prec.logicalprogrms.armstrongnumber;

public class Armstrong {
	int number;
	public Armstrong() {}
		public Armstrong(int number) {
			this.number=number;
	}
		public void setNumber(int number) {
			this.number=number;
		}
		public int getNumber() {
			return number;
		}
		public int calculateNoOfdigit() {
			int temp=number;
			int i=0;
			while(temp!=0) {
				temp/=10;
				i++;
			}
			return i;
		}
		public int calculatePower(int base, int exp) {
		int power=1;
			for(int i=0;i<exp;i++) 
				power*=base;
				
				return power;
			}
			public boolean isArmstrongNumber() {
				int temp=number;
				//int noOfDigits=calculateNoOfdigit();
				int noOfdigits=number+"".length();
				System.out.println(noOfdigits);
				int result=0;
				while(temp!=0) {
					//result+=calculatePower(temp%10,noOfDigits);
					temp/=10;
				}
				return result==number;
		}
}
