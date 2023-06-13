public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 10, 20, 10}; // Example array with duplicate values
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest number is: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        
        return secondLargest;
    }
}
