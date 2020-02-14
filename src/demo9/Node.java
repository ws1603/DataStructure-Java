package demo9;
//4.15 代码实现创建赫夫曼树

/**
 * 排序
 * 取出根节点权值最小的两颗二叉树
 * 组成一颗新的二叉树，前面取出来的两颗二叉树是新二叉树的两个子树
 * 根节点的权值是前面取出来的两颗二叉树的根节点的权值之和
 */
public class Node implements Comparable<Node> {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value - o.value);
    }

    @Override
    public String toString() {
        return "Node[value=" + value + "]";
    }
}
