import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println ("Digite um numero: ");
	 double n =sc.nextDouble();
	 while (n>=0) {
		 double raiz= Math.sqrt(n);
		 System.out.println( raiz);
		 System.out.println("Digite outro numero");
		 n=sc.nextDouble();
	 }
	 System.out.println("Numero negativo");
	}

}
