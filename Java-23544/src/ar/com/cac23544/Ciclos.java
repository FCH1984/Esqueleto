package ar.com.cac23544;

public class Ciclos {

	public static void main(String[] args) {
		
		//array de enteros
		var edades = new String[] {"1","2","3","4","5"};

		var edades2 = new int[5];
		edades2[0] = 100;
		edades2[1] = 200;
		edades2[2] = 300;
		edades2[3] = 400;
		edades2[4] = 500;
		
		//ciclos
		for(int i=0;i<edades.length;i++) {
			System.out.println(edades[i]);
		}
		
		for (var i : edades2) {
			System.out.println(i);
		}
		
		int idx = edades.length-1;//4
		while( idx >= 0 ) {//entra si se cumple
			System.out.println(edades[idx]);
			idx = idx - 1; 
		}
		
		//do/while
		int opMenu = 10;//1,2,3,4
		
		do {
			//minimo una vez lo hace!!!
			System.out.println("Opcion " + opMenu);
			opMenu--;
		}while(opMenu > 0);
	}

}
