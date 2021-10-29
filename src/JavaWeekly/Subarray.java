package JavaWeekly;

public class Subarray {

	int subArraySum(int arr[], int n, int sum){
        int currentSum, i, j;
 
        for (i = 0; i < n; i++) {
        	currentSum = arr[i];
 
            for (j = i + 1; j <= n; j++) {
                if(currentSum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found b/t index " + i + " & " + p);
                    return 1;
                }
                if(currentSum > sum || j == n)
                    break;
                currentSum = currentSum + arr[j];
            }
        }
        System.out.println("Cannot find subarray");
        return 0;
    }

public static void main(String[] args) {
	
	 Subarray sumOfArray = new Subarray();
        int arr[] = {14, 12, 70, 15, 99, 65, 21, 90 };
        int n = arr.length;
        int sum = 97;
        sumOfArray.subArraySum(arr, n, sum);
	}
}
