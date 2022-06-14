package jana60.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	//metodo
	
	int math(boolean op) {
	    int areaperimetro;
	    if (op) {
			areaperimetro = base * altezza;	
		} else {
			areaperimetro = (base + altezza)*2;
		}
	
		return areaperimetro;
	}	

}
