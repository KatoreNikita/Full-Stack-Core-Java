package logicalprograms.menudriven.helper;
import in.prec.logicalprograms.menudriven.helper.Helper;
import java.util.Scanner;
public class MainMenudriven {
	int choice=0;
	Scanner scanner=new Scanner (System.in);
	Helper helper =new Helper();
	do {
		choice=helper.printMenu(scanner);
		switch(choice) {
		case 1 -> helper.checkPrime(scanner);
		case 2 -> helper.checkPerfect(scanner);
		case 3 -> helper.checkPallindrome(scanner);
		case 4 -> 
		case 0 -> helper.checkexist(scanner);
		}
	}while (choice!=0);
	scanner.close();
}

}
