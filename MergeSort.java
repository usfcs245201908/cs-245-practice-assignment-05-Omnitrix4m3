import java.util.Arrays;

public class MergeSort implements SortingAlgorithm
{
	public void sort(int[] a)
	{
		if (a.length > 1)
		{
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, (a.length / 2) + 1, a.length);

			merge(a, left, right);
		}
	}

	private void merge(int[] a, int[] left, int[] right)
	{
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length)
		{
			if (left[i] <= right[j])
			{
				a[k++] = left[i++]; 
			}

			else
			{
				a[k++] = right[j++];
			}
		}

		while (i < left.length)
		{
			a[k++] = left[i++];
		}

		while (j < right.length)
		{
			a[k++] = right[j++];
		}
	}

	/*
	public static void merge(int[] result, int[] left, int[] right)
	{
		int i1 = 0;
		int i2 = 0;
		
		for (int i = 0; i < result.length; i++)
		{
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2]))
			{
				result[i] = left[i1];
				i1++;
			}
			
			else
			{
				result[i] = right[i2];
				i2++;
			}
		}
	}
	*/
}