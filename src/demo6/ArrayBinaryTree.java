package demo6;

// 4.8 顺序存储的二叉树的遍历

/**
 * 顺序存储的二叉树通常只考虑完全二叉树
 * <p>
 * 第n个元素的左子节点是：2*n+1
 * 第n个元素的右子节点是：2*n+2
 * 第n个元素的父节点是：(n-1)/2
 */

public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前节点的内容
        System.out.println(data[index]);
        //2*index+1;处理左子树
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        //2*index+2;处理右子树
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }
}


