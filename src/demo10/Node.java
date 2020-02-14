package demo10;
// 4.17 数据压缩之创建赫夫曼树

/**
 * 统计字符数并排序
 * 创建赫夫曼树
 * 创建赫夫曼编码表
 * 编码
 */
public class Node implements Comparable<Node> {
    Byte data;
    int weight;
    Node left;
    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;

    }

    @Override
    public int compareTo(Node o) {
        return o.weight - this.weight;//倒序排
    }

    @Override
    public String toString() {
        return "Node[data=" + data + ",weight=" + weight + "]";
    }
}
