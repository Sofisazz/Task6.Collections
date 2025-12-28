import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        HeavyBox box1 = new HeavyBox(2, 3, 33);
        HeavyBox box2 = new HeavyBox(4, 5, 45);
        HeavyBox box3 = new HeavyBox(1, 8, 39);
        HeavyBox box4 = new HeavyBox(3, 3, 40);

        ArrayList<HeavyBox> boxes = new ArrayList<>();
        Collections.addAll(boxes, box1, box2, box3, box4);

        int numOfBox = 1;
        for (HeavyBox box : boxes) {
            System.out.printf("Ящик %d: ", numOfBox);
            System.out.printf("Размер: %d м², Вес: %d кг", box.getSize(), box.getWeight());
            System.out.println();
            numOfBox++;
        }
        System.out.println();

        boxes.getFirst().setWeight(1);
        boxes.removeLast();

        HeavyBox[] boxArray1 = boxes.toArray(new HeavyBox[0]);

        numOfBox = 1;
        for (HeavyBox box : boxArray1) {
            System.out.printf("Ящик %d: ", numOfBox);
            System.out.printf("Размер: %d м², Вес: %d кг", box.getSize(), box.getWeight());
            System.out.println();
            numOfBox++;
        }
        System.out.println();

        HeavyBox[] boxArray2 = new HeavyBox[boxes.size()];
        for (int i = 0; i < boxes.size(); i++) {
            boxArray2[i] = boxes.get(i);
        }

        numOfBox = 1;
        for (HeavyBox box : boxArray2) {
            System.out.printf("Ящик %d: ", numOfBox);
            System.out.printf("Размер: %d м², Вес: %d кг", box.getSize(), box.getWeight());
            System.out.println();
            numOfBox++;
        }
        System.out.println();

        HeavyBox[] boxArray3 = boxes.toArray(new HeavyBox[boxes.size()]);

        numOfBox = 1;
        for (HeavyBox box : boxArray3) {
            System.out.printf("Ящик %d: ", numOfBox);
            System.out.printf("Размер: %d м², Вес: %d кг", box.getSize(), box.getWeight());
            System.out.println();
            numOfBox++;
        }
        System.out.println();

        boxes.clear();
    }
}