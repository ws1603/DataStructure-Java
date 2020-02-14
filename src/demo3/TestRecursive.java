package demo3;

// 2.15 递归和斐波那契
public class TestRecursive {
    public static void main(String[] args) {
        print(10);
    }

    //递归
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i - 1);
        }
    }
}
