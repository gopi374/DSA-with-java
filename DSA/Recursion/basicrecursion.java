public class basicrecursion {
    public static void main(String[] args) {
        // Recusion is a process in which a function calls itself directly or indirectly. The main idea behind recursion is to 
        // break down a complex problem into smaller, more manageable subproblems. A recursive function typically has two main 
        // components: a base case that stops the recursion and a recursive case that continues to call the function until it 
        // reaches the base case.
        int n=5;
        fun(n);
    }
    static void fun(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        fun(a-1);
    }
}
