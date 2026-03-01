// import Java.lang;
class Try {
    public static void main(String[] args) {
        try {
            // Attempting to access an array element at an invalid index
            int[] numbers = new int[5];
            System.out.println(numbers[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("This block always executes, regardless of whether an exception occurred or not.");
        }
    }
}
