package demo13;

public class StuInfo {

    private int age;
    private int count;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public StuInfo(int age) {
        this.age = age;
    }

    public StuInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }

    /**
     * 散列函数
     *
     * @return age
     */
    public int hashCode() {
        return age % 10;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
