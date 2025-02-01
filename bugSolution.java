public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // This line is still incorrect, but we catch the exception
            System.out.println("Value: " + arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds: " + e.getMessage());
        }
        // Safe way to access elements within bounds
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}