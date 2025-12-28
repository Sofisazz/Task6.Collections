public class HeavyBox {

    private int length;
    private int height;
    private int weight;

    HeavyBox(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    int getSize() {
        return length * height;
    }

    int getWeight() {
        return weight;
    }

    void setSize(int length, int height) {
        this.length = length;
        this.height = height;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

}
