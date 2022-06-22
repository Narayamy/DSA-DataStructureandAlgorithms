package Assignment03;

public class Assignment03 {

	public static void main(String[]args)	{
		
		Assignment03 a3 = new Assignment03();

	    a3.testSpeed(10);
		a3.testSpeed(64);
		a3.testSpeed(65);
		a3.testSpeed(100);
		a3.testSpeed(5000);
		
	}

	void testSpeed(int size){
		double[] arr = createArray(size);
		long start = System.nanoTime();
		mergeInsertSort(arr,0,arr.length);		
		long end = System.nanoTime();
		long timeToRun = end-start;
		System.out.println("Time in nanseconds for array size "+size+": "+timeToRun);

		checkSort(arr); // If array is not sorted it will print an error
		if (arr.length<102) {
			printArray(arr);
		}
	}

	public double[] createArray(int numElements)
	{
		double[] myArray = new double[numElements];
	    for(int i=0;i<numElements;i++){
		    myArray[i] = Math.random()*100;
		}
		return myArray;
	}

	public double[] checkSort(double[] arr){
		System.out.println("#############");
		
	    for(int i=0; i<arr.length-1; i++){
	    	if (arr[i] > arr[i+1]){
		    	for(int j=0; j<arr.length; j++){
		    		if (j==i)System.out.print("###");
		    		if (j==i+2)System.out.print("###");
		    		System.out.print(arr[j] + " ");
		    	}
		    	System.out.println();
		    	System.out.println();
		    	System.out.printf("!!!!! Array is not sorted, value at index %d is bigger than the next value\n", i);
		    	System.out.println();
		    	break;
		    }
		}
		return arr;
	}

	public void printArray(double[] myArray)
	{
		for(int j=0;j<myArray.length;j++){
			System.out.print(myArray[j]+" ");
		}
		System.out.println();
	}
	
	
	public void mergeInsertSort(double[] arr, int lb, int ub) {
		
		// sort the array if it is less than or equal to 100
		if(ub<=100) {
			if(lb+1 < ub){
				int mid = (lb+ub)/2;
				mergeInsertSort(arr,lb,mid);
				mergeInsertSort(arr,mid,ub);
				merge(arr,lb,mid,ub);
			}
		}
		
		// use insertion sort to break the array if it is greater than 100
		// then use the merge to sort each piece
		else {
			if(lb+1 < ub){
				int mid = (lb+ub)/2;
				mergeInsertSort(arr,lb,mid);
				mergeInsertSort(arr,mid,ub);
				insertSort(arr,lb,ub);
				merge(arr,lb,mid,ub);
			}
		}
	}

	public void merge(double[] arr, int lo, int mid, int hi) {
		
		int loCount = lo;
		int hiCount = mid;
		
		double[] temp = new double[hi-lo];
		int t = 0;
		while(loCount < mid && hiCount < hi){
			if(arr[loCount] <= arr[hiCount]){
				temp[t] = arr[loCount];
				loCount++;
				t++;
			}
			else{
				temp[t] = arr[hiCount];
				hiCount++; t++;
			}
		}
		while(loCount < mid){
			temp[t]=arr[loCount];
			loCount++;
			t++;
		}
		while(hiCount < hi){
			temp[t] = arr[hiCount];
			hiCount++;
			t++;
		}
		
		int i = lo; t = 0;
		while(t < temp.length){
			arr[i] = temp[t];
			i++; t++;
		}
	}

	public void insertSort(double[] arr, int start, int end) {
		int j = start;
		while(j < end){
			int i = j;
			while(i > 0 && arr[i] < arr[i-1]){
				double temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
				i = i - 1;
			}
			j = j + 1;
		}
	}
	
}