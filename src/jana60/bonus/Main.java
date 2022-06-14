package jana60.bonus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Rettangolo Operazioni = new Rettangolo();
	Scanner scan= new Scanner(System.in);
	int AreaG = 0;
	int counter = 0;
	
	for (int i = 0; i < 5; i++) {
		System.out.println("Inserisci la base del " + (i + 1)+"° " + "rettangolo :" );
		Operazioni.base = scan.nextInt();
		System.out.println("Inserisci l'altezza del " + (i + 1)+"° " + "rettangolo :" );
		Operazioni.altezza = scan.nextInt();
		
		if (AreaG < Operazioni.area()) {
			AreaG = Operazioni.area();
			counter = i +1;
		}
		
		
		
	}
	scan.close();
	System.out.println("l'area del "+ counter +"° rettangolo e' la piu' grande : "+ AreaG);
	}

}
