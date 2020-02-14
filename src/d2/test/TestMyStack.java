package d2.test;

import demo2.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        //创建一个栈
        MyStack ms = new MyStack();
        //压入数据
        ms.push(9);
        ms.push(8);
        ms.push(7);
        //取出栈顶元素
//        System.out.println(ms.pop());
//        System.out.println(ms.pop());
//        System.out.println(ms.pop());
        //查看栈顶元素
        System.out.println(ms.peek());
        System.out.println(ms.isEmpty());
        ms.pop();
        ms.pop();
        ms.pop();
        System.out.println(ms.isEmpty());

    }

}
