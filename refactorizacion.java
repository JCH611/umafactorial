import java.util.Scanner;

public class factorial {
	public static long fact(long num) {
		if(num<=1){
			return 1;
		}else{
			return num*fact(num-1);
		}

		}
		return fac;
	}
public static long getNumber() {
	Scanner scanInput = new Scanner(System.in);
	System.out.print("Introduzca un numero: ");
	long num = scanInput.nextLong();
	scanInput.close();
	return num;
}



}

