package volodymyr;

public class Application {

	public static void main(String[] args) {
		
//№1 Написати по одній змінній кожного типу примітивних типів даних.
		
//		byte
//		short
//		integer
//		long
//		char
//		float
//		double
//		boolean
//		string
		
//№2 Вивести на консоль мінімальне і максимальне значення типів даних. 
//Вивід здійснюється за допомогою System.out.println(); та Java Wrappers (обгортки примітивів).
		
		System.out.println("Byte max = "+Byte.MAX_VALUE);
		System.out.println("Byte min = "+Byte.MIN_VALUE);
		System.out.println();
		System.out.println("Short max ="+Short.MAX_VALUE);
		System.out.println("Short min ="+Short.MIN_VALUE);
		System.out.println();
		System.out.println("Integer max ="+Integer.MAX_VALUE);
		System.out.println("Integer min ="+Integer.MIN_VALUE);
		System.out.println();
		System.out.println("Long max ="+Long.MAX_VALUE);
		System.out.println("Long min ="+Long.MIN_VALUE);
		System.out.println();
		System.out.println("Float max ="+Float.MAX_VALUE);
		System.out.println("Float min ="+Float.MIN_VALUE);
		System.out.println();
		System.out.println("Double max ="+Double.MAX_VALUE);
		System.out.println("Double min ="+Double.MIN_VALUE);
		//System.out.println();
		//System.out.println("Boolean max ="+Boolean.TRUE);
		//System.out.println("Boolean min ="+Boolean.FALSE);
		System.out.println();
		System.out.println("Character max = \\ u0000 or 0");
		System.out.println("Character min = \\ uffff or 65535");
		System.out.println();
		//System.out.println("String max = any word or letter");
		//System.out.println("String min = null");
		//System.out.println();

		displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
		System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);


//№3 Створити масив, наповнити його 10 значеннями типу int, 
//знайти максимальне та мінімальне значення в масиві та вивести їх на консоль.		
		
	int[] a = {2, 10, 20, 19, 60, 66, 43, 332, 15, -100, -10, 0};
		int indexOfMax = 0;
		int indexOfMin = 0;
		
		for (int i = 1; i<a.length; i++) {
			if (a[i]> a[indexOfMax]) {
				indexOfMax = i;
			}
		}
		for(int i = 1; i<a.length; i++) {
			if (a[i]<a[indexOfMin]) {
				indexOfMin = i;
			}
		}
		System.out.println();
		System.out.println("Індекс в масиві = "+indexOfMax + " " +"МАХ число = "+ a[indexOfMax]);
		System.out.println("Індекс в масиві = "+indexOfMin + " " +"МIN число = "+ a[indexOfMin]);
	}
}	
