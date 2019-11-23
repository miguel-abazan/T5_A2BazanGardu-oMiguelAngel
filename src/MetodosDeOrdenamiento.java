import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MetodosOrdenamiento{
	static long contIntercambio,contVueltas;
	static long tInicio,tFinal;
	static class Burbuja{
		
		public static void ordenarBurbujaUno(int numeros[]) {
			 tInicio=System.nanoTime();
			 int pas=0;
			for (int i = 1; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length-1; i--) {
					if (numeros[j]>(numeros[j+1])) {
						int aux=numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]= aux;
					}
					pas++;
				}
			}
			System.out.println(tFinal= System.nanoTime()- tInicio);
			System.out.println("Pasadas:  "+pas);
		}
		public static void OrdenarBurbujaDos(int numeros[]) {
			
			int pas=0;
			for ( int i= 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i]>numeros[j]) {
						int aux=numeros[i];
						numeros[i]=numeros[j];
						numeros[j]=aux;
		
					}
					pas++;
					
				}
				
			}
			System.out.println(tFinal= System.nanoTime()- tInicio);
			System.out.println("Pasadas:  "+pas);
		}
		public static void OrdenarBurbujaTres(int numeros[]) {
			int i = 1;
			int pas=0;
			for (int j = 0; j < numeros.length - i; j++) {
				if (numeros[j] > numeros[j + 1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
				pas++;
			}
			System.out.println(tFinal= System.nanoTime()- tInicio);
			System.out.println("Pasadas:  "+pas);
		}
		

	}
	public void mostrarVector (int vector[]) {
		System.out.println(Arrays.toString(vector));
	}
}	//class Burbuja
		
public class MetodosDeOrdenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner e = new Scanner(System.in);
		boolean a = true;
		MetodosOrdenamiento ob = new MetodosOrdenamiento();
		
		Random r = new Random();
		int arr[] = new int [100000];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = r.nextInt(100);
		}
		int n = arr.length;
		int ar[] = Arrays.copyOf(arr, arr.length);
		
		do {
			arr = Arrays.copyOf(ar, ar.length);
			System.out.println("Seleccione un metodo de ordenamiento");
			System.out.println("1.- Metodo Burbuja");
			System.out.println("2.- Metodo QuickSort");
			System.out.println("3.- Metodo ShellSort");
			System.out.println("4.- Metodo RadixSort");
			System.out.println("5.- Metodo Intercalacion");
			System.out.println("6.- Metodo Mezcla directa");
			System.out.println("7.- Metodo Mezcla natural");
			System.out.println("8.- Metodo Busqueda binaria");
			System.out.println("9.- Metodo Busqueda por funciones hash");
			byte op = e.nextByte();
			switch (op) {
			case 1:
				System.out.println("Ordenando por el metodo Burbuja");
				MetodosOrdenamiento.Burbuja.ordenarBurbujaUno(arr);
				MetodosOrdenamiento.Burbuja.OrdenarBurbujaDos(arr);
				MetodosOrdenamiento.Burbuja.OrdenarBurbujaTres(arr);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			
			default:
				break;
			}
			

			
		} while (a);
		e.close();
	}


	}


