import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		int[] vectA, vectB, vectC;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		vectA = new int[n];
		vectB = new int[n];
		vectC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < n; i++) {
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}
}
