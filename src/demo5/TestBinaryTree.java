package demo5;

public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binTree = new BinaryTree();
        //创建根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给数
        binTree.setRoot(root);
        //创建一个左节点
        TreeNode rootL = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建一个右节点
        TreeNode rootR = new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历数
        binTree.frontShow();
        System.out.println("========================");
        //中序遍历
        binTree.midShow();
        System.out.println("========================");
        //后序遍历
        binTree.afterShow();
        System.out.println("========================");
        //前序查找
        TreeNode result = binTree.frontSearch(5);
        System.out.println(result);
        //删除一个子树
        binTree.delete(4);
        binTree.frontShow();
    }
}
