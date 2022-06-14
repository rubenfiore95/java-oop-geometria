package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Rettangolo Operazioni = new Rettangolo();
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Inserisci la base: ");
	Operazioni.base = scan.nextInt();
	System.out.println("Inserisci l'altezza ");
	Operazioni.altezza = scan.nextInt();
	
	scan.close();
	System.out.println("l'area del rettangolo e' : "+ Operazioni.math(true) + " mentre il suo perimetro e': " + Operazioni.math(false));
	}

}
