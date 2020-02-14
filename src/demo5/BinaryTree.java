package demo5;
// 4.3 创建二叉树

/**
 * 二叉树：任何一个节点的子节点都不超过2
 * 二叉树的节点分左节点和右节点
 * <p>
 * 满二叉树：所有叶子节点都在最后一层，而且节点的总数为：2^n-1,n是数的高度
 * <p>
 * 完全二叉树：所有叶子节点都在最后一层或倒数第二层，且最后一层的叶子节点在左边
 * 连续，倒数第二层的叶子节点在右边连续
 */

public class BinaryTree {

    TreeNode root;

    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //获取根节点
    public TreeNode getRoot() {
        return root;
    }

    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void delete(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}
