package ControlStructures;

public class ArrayMethods1 
{	
	public static void main(String[] args)
	{
		String[] a = {"g", "b", "e", "c", "a", "f", "d", "i", "h"};
		int[] ints = {5, 4, 3, 1, 9, 8, 7, 4 , 5, 6};
		double[] dubs = {6.4, 3.2, 4.4, 9.9, 0.2, 5.2, 1.2, 7.4, 2.8};
		
		//integer insertion
		for(int x : ints)	
		{
			System.out.print(x + " ");
		}
		System.out.println();
		long start = System.nanoTime();
		insertionSort(ints);
		long end = System.nanoTime();
		long time = end - start;
		for(int x : ints)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Time to sort: " + time + " ns");
		System.out.println();
		
		//double selection
		for(double x : dubs)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		start = System.nanoTime();
		selectionSort(dubs);
		end = System.nanoTime();
		time = end - start;
		for(double x : dubs)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Time to sort: " + time + " ns");
		System.out.println();
		
		//String bubble
		for(String x : a)	
		{
			System.out.print(x + " ");
		}
		System.out.println();
		start = System.nanoTime();
		bubbleSort(a);
		end = System.nanoTime();
		time = end - start;
		for(String x : a)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Time to sort: " + time + " ns");
	}


	
	public static void insertionSort(int[] x)
	{
		int lock = 0;
		while(lock < x.length)
		{
			for(int i = lock+1; i < x.length; i++)
			{
				if(x[i] < x[lock])
				{
					swap(x, lock, i);
				}
			}
			lock++;
		}
	}
	
	public static void selectionSort(double[] x)
	{
		for(int i = 0; i < x.length; i++)
		{
			int d = i;
			for(int j = d; j < x.length; j++)
			{
				if(x[j] < x[d])
				{
					d = j; 
				}
			}
			swap(x, i, d);
		}
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
