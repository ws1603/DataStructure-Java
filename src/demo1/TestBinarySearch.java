package demo1;

import java.util.Scanner;

// 2.6 查找算法之二分查找
public class TestBinarySearch {

    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //输入目标元素
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        //记录开始的位置
        int begin = 0;
        //记录结束位置
        int end = arr.length - 1;
        //记录中间的位置
        int mid = (begin + end) / 2;
        //记录目标位置
        int index = -1;
        //循环查找
        while (true) {
            //什么情况下没有这个元素？
            //如果开始位置在结束位置之后或重合
            if (end < begin) {
               break;
            }

            //判断中间的这个元素是不是要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
                //中间这个元素不是要查找的元素
            } else {
                //判断中间这个元素是不是比目标元素大
                if (arr[mid] > target) {
                    //把结束位置调整到中间位置的前一个位置
                    end = mid - 1;
                    //中间这个元素比目标元素小
                } else {
                    //把开始位置调整到中间位置后一个位置
                    begin = mid + 1;
                }
                //取出新的目标位置
                mid = (begin + end) / 2;
            }
        }
        System.out.println(index);
    }

}
