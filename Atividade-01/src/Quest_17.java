import java.util.Scanner;

public class Quest_17 {
	public static void main(String[] args) {
		int a, b;
	
		Scanner valor = new Scanner(System.in);
	
		System.out.println("Digite o 1 valor: ");
		a = valor.nextInt();
		
		System.out.println("Digite o 2 valor: ");
		b = valor.nextInt();
	
	
		if(a>10 || a + b == 20) {
			System.out.println("Numero valido");
		
		}else if(a == b){
			System.out.println("A é igual B");
			
		}
		if(a != 10 && b!= 10 && a<10){
			System.out.println("A é menor que 10");
			
		}
		valor.close();
		
	}
}
