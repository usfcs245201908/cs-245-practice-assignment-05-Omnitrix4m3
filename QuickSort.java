public class QuickSort implements SortingAlgorithm
{
	public void sort(int[] a)
	{
		sort(a, 0, a.length - 1);
	}

	private void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        {
			int pi = partition(arr, low, high); 
  
            sort(arr, low, pi - 1); 
            sort(arr, pi + 1, high); 
        }
    }
	
	
	int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low - 1); 
        
		for (int j = low; j < high; j++) 
        {
			if (arr[j] < pivot) 
            {
				i++; 
   
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }

        int temp = arr[i + 1]; 
        arr[i + 1] = arr[high]; 
        arr[high] = temp; 
  
        return i + 1; 
    }
}