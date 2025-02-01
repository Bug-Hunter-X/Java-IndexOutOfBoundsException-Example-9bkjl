public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[5] = 10; // IndexOutOfBoundsException
        System.out.println("Value: " + arr[5]);
    }
}