/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		double arr[] = new double[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextDouble();
		}
		
		for (double i : arr) {
		    System.out.print(i + " ");
		}
		System.out.println();
		
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
		    sum += arr[i];
		    arr[i] = sum / (i + 1);
		}
		
		for (double i : arr) {
		    System.out.print(i + " ");
		}
		
	}
}



import java.util.Scanner;
import java.util.ArrayList;

class ThirdProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> arr = new ArrayList<Double>();

        int arrSize;
        arrSize = sc.nextInt();

        for (int i = 0; i < arrSize; i++) {
            arr.add(sc.nextDouble());
        }

        System.out.println("Initial array: ");
        for (Double aDouble : arr) {
            System.out.print(aDouble + " ");
        }
        System.out.println();

        int currentIndex = 1;
        for (int i = 1; i < arrSize; i++) {
            if (arr.get(currentIndex) < arr.get(currentIndex - 1)) {
                arr.remove(currentIndex);
            } else currentIndex++;
        }
        System.out.println();

        System.out.println("Processed array: ");
        for (Double aDouble : arr) {
            System.out.print(aDouble + " ");
        }
    }
}

class SecondProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        int toRemove;

        try {
            arrSize = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < arrSize; i++) {
                arr.add(sc.nextInt());
            }
            toRemove = sc.nextInt();

            System.out.println("Initial array: ");
            for (int i = 0; i < arrSize; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();

            int curIndex = 0;
            for (int i = 0; i < arrSize; i++) {
                if (arr.get(curIndex) == toRemove) {
                    arr.remove(curIndex);
                } else {
                    curIndex++;
                }
            }

            System.out.println("Processed array: ");
            for (int aInt : arr) {
                System.out.print(aInt + " ");
            }

        } catch (Exception e) {
            System.out.println("DAMN U R SO DUMB");
        }
    }
}