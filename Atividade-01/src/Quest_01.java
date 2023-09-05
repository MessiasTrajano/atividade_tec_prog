import java.util.Scanner;		

public class Quest_01 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o 1 valor: ");
		a = valor.nextInt();
		
		System.out.println("Digite o 2 valor: ");
		b = valor.nextInt();
		
		
		if(a>10) {
			System.out.println("A > 10");
		}
		
		if(a + b == 20){
			System.out.println("A + B == 20");
			
		}else {
			System.out.println("Numero não válido");
		}
		valor.close();
	}

}