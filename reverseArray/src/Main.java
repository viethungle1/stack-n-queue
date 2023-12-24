import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Stack <Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i: arr) {
            System.out.println(i);

        }

    }
}