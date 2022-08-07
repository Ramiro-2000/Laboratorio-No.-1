import java.util.Scanner;
class Controlador{
	
	public static void main(String[] args){
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		while (opcion != 6){
			System.out.println("-----MENU-----\n\n1. Aritmeticas\n2. Estadisticas\n3. Matrices\n4. Ecuaciones\n5. Avanzadas\n6. Salir\n\nPOR FAVOR INGRESE EL TIPO DE OPERACION A REALIZAR");
			opcion = scan.nextInt();
			if(opcion==1){
				Aritmeticas();
			}
		}
	}
	
	public static void Aritmeticas(){
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-----ARITMETICAS-----\n\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Potencia\n6. Atras\n\nPOR FAVOR INGRESE EL TIPO DE OPERACION A REALIZAR");
		
		opcion = scan.nextInt();
		if(opcion==1){
			SumaAritmetica();
		}else if(opcion==2){
			RestaAritmetica();
		}else if(opcion==3){
			MultiplicacionAritmetica();
		}else if(opcion==4){
			DivisionAritmetica();
		}else if(opcion==5){
			PotenciaAritmetica();
		}
		
	}
	
	public static void SumaAritmetica(){
		float sumando1 = 0;
		float sumando2 = 0;
		float resultado = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-----SUMA-----\n\nPor favor ingrese los siguientes valores...\n1. Pimer sumando:");
		sumando1 = scan.nextFloat();
		System.out.println("\n2. Segundo sumando:");
		sumando2 = scan.nextFloat();
		resultado = sumando1 + sumando2;
		System.out.println("\nEl resultado es "+sumando1+" + "+sumando2+" = "+resultado);
	}
	
	public static void RestaAritmetica(){
		float sumando1 = 0;
		float sumando2 = 0;
		float resultado = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-----RESTA-----\n\nPor favor ingrese los siguientes valores...\n1. Munuendo:");
		sumando1 = scan.nextFloat();
		System.out.println("\n2. Sustraendo:");
		sumando2 = scan.nextFloat();
		resultado = sumando1 - sumando2;
		System.out.println("\nEl resultado es "+sumando1+" - "+sumando2+" = "+resultado);
	}
	
	public static void MultiplicacionAritmetica(){
		float factor1 = 0;
		float factor2 = 0;
		float resultado = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-----MULTIPLICACION-----\n\nPor favor ingrese los siguientes valores...\n1. Primer factor:");
		factor1 = scan.nextFloat();
		System.out.println("\n2. Segundo factor:");
		factor2 = scan.nextFloat();
		resultado = factor1 * factor2;
		System.out.println("\nEl resultado es "+factor1+" * "+factor2+" = "+resultado);
	}
	
	public static void DivisionAritmetica(){
		float Dividendo = 0;
		float Divisor = 0;
		float resultado = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-----DIVISION-----\n\nPor favor ingrese los siguientes valores...\n1. Dividendo:");
		Dividendo = scan.nextFloat();
		System.out.println("\n2. Divisor:");
		Divisor = scan.nextFloat();
		
		while(Divisor==0){
			System.out.println("\nError. El divisor no puede ser cero. Intente de nuevo\n Divisor:");
			Divisor = scan.nextFloat();
		}
		
		resultado = Dividendo / Divisor;
		System.out.println("\nEl resultado es "+Dividendo+" / "+Divisor+" = "+resultado);
		
	}
	
	public static void PotenciaAritmetica(){
		float Base = 0;
		int Potencia = 0;
		float resultado = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-----POTENCIA-----\n\nPor favor ingrese los siguientes valores...\n1. Base:");
		Base = scan.nextFloat();
		System.out.println("\n2. Potencia:");
		Potencia = scan.nextInt();
		
		resultado = Elevar(Base, Potencia);
		
		System.out.println("\nEl resultado es "+Base+" ^ "+Potencia+" = "+resultado);
		
	}
	
	public static float Elevar(float Base, int Potencia){
		
		float resultado=1;
		
		int contador=0;
		
		while (contador<Potencia){
			resultado=resultado*Base;
			contador=contador+1;
		}
		
		return resultado;
	}
	
}