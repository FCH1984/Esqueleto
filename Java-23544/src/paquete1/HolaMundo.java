package paquete1;

/*
 * public: es un modificador de visibilidad (P.O.O) 
 * class: indica que es una clase
 * HolaMundo: nombre de la clase, con es igual al nombre de archivo
 */
public class HolaMundo {

	/*
	 * public: es un modificador de visibilidad (P.O.O)
	 * static: indica que no pertenece a un objeto, sino a la clase
	 * void: es un tipo de dato (nada)
	 * main: nombre del metodo de esta clase (HolaMundo)
	 * String[]: array de String
	 * args: nombre de la variable
	 */
	public static void main(String[] args) {
		//ctrl+s
		System.out.println("hola mundo, tengo hambre!!");
		
		//variables, tipos de datos
		//numeros,enteros o decimales
		byte b = 127;//127
		short s = 32767;//ctrl+shit+/- 
		int i = 32768;
		long l = 32768; 
		
		//numero con decimales
		float f = 15.5f;
		double d = 157.5;//los numeros con decimales por defecto son double
		
		//java.math.BigDecimal para investigar
		//java.math.BigInteger para investigar
		
		// byte < short < int < long < float < double
		d = b;
		f = (float)d;//error, con casting ??
		
		float altura = 175.5f;
		
		//casting
		int alturaInt = (int)altura;//175
		
		//Caracteres
		char letra = '1';//puede contener un caracter
		
		//los de arriba con tipos de datos primitivos
		
		
		//String es un tipo de datos, pero ademas es una Clase
		//Wrapper
		
		String palabra = "soy un string";
				
		// operadores logicos:boolean, relacionales: boolean, aritmeticos:valor 
		/*
		&& 
		||
		!
		& // investigar
		| // investigar
		+*/
		int a = 10;
		int b1 = 20;
		var c = a > 10 || b1 > 10;//boolean
		var aux = "soy una cadena";
		
		var no10 = !!(a == 10);//true
		
		//aritmeticos
		short shor = 256;
		int suma = (byte)shor;//-128 
		
		//tph!!! la suma de dos enteros vuelva a 0
		
		System.out.println("suma=" + suma);//f5/f6/f7/f8
		//if/else
		if(a > 10 && b > 10) {
			 System.out.println("> 10");
		}else {
			System.out.println("alguno < 10 o los dos");
		}
		
		//swich/case
		switch (a) {
			case 1: 
				System.out.println("a es 1");
				break;
			case 2: 
				System.out.println("a es 2");
				break;
			case 3:
			case 4:
				System.out.println("a es 3 o 4");
				break;
			case 10:
				System.out.println("a es 10");
				break;
			default:
				System.out.println("< 0 o > 4");
		}
		
		//ejercicio
		
	}

}
