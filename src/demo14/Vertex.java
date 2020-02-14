package demo14;

/**
 * 图
 * 顶点(Vertex),边(edge),路径,无向图,有向图,带权图，邻接矩阵
 */

//顶点类
public class Vertex {
    private String value;
    public boolean visited;

    public Vertex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                '}';
    }
}
