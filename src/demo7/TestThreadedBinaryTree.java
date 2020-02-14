package demo7;

public class TestThreadedBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        ThreadedBinaryTree binTree = new ThreadedBinaryTree();
        //创建根节点
        ThreadedNode root = new ThreadedNode(1);
        //把根节点赋给数
        binTree.setRoot(root);
        //创建一个左节点
        ThreadedNode rootL = new ThreadedNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建一个右节点
        ThreadedNode rootR = new ThreadedNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new ThreadedNode(4));
        ThreadedNode fiveNode = new ThreadedNode(5);
        rootL.setRightNode(fiveNode);
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new ThreadedNode(6));
        rootR.setRightNode(new ThreadedNode(7));
        //中序遍历
        binTree.midShow();
        System.out.println("========================");

        System.out.println("=========================");
        //中序线索化二叉树
        binTree.threadNodes();
        //遍历线索化二叉树
        binTree.threadIterate();
//        //获取5节点的后继节点
//        ThreadedNode afterFive = fiveNode.rightNode;
//        System.out.println(afterFive.value);
    }
}
