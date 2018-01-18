package ControlStructures;

public class ArrayMethods1 
{	
	public static void main(String[] args)
	{
		String[] a = {"g", "b", "e", "c", "a", "f", "d", "i", "h"};
		for(String x : a)
		{
			System.out.print(x);
		}
		System.out.println();
		bubbleSort(a);
		for(String x : a)
		{
			System.out.print(x);
		}
	}


	
	public static void insertionSort(int[] x)
	{
		
	}
	
	public static void selectionSort(double[] x)
	{
		
	}
	
	public static void bubbleSort(String[] x)
	{
		int L = x.length-1;
		int swaps = 1;
		while(swaps>0)
		{
			swaps = 1;
			for(int i = 0; i<L; i++)
			{
				if(x[i].compareTo(x[i+1])>0)
				{
					if(i==L-1) 
					{
						L--;
					}
					swap(x, i, i+1);
					swaps++;
				}

			}
			swaps = swaps-1;
			
		}
	}
	
	
	
	public static void swap(int[] a, int x, int y)
	{
		int s = a[x];
		a[x] = a[y];
		a[y] = s;
	}
	public static void swap(double[] a, int x, int y)
	{
		double s = a[x];
		a[x] = a[y];
		a[y] = s;
	}
	public static void swap(String[] a, int x, int y)
	{
		String s = a[x];
		a[x] = a[y];
		a[y] = s;
	}
}
