// module exam question no 1
	import java.util.Arrays;
	public class SortingMain{
		public static void insertionSort(int[] arr){
			for(int i =1; i<arr.length; i++){
				int  j,temp = arr[i];
				
				for(  j = i-1; j>0&& arr[j]>temp; j--){
					arr[j+1] = arr[j];
				}System.out.println(Arrays.toString(arr));
				arr[j+1] = temp;
				//System.out.println(Arrays.toString(arr));
			}
			//System.out.println(Arrays.toString(arr));
		}
		public static void main(String...args){
			int[] arr = {2,4,6,8,3};
			System.out.println("Before: "+Arrays.toString(arr));
			insertionSort(arr);
			System.out.println("After: "+Arrays.toString(arr));
		}
	
	}