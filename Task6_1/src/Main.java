import java.util.*;

public class Main {

    public static void main(String[] args){

        System.out.print("Введите набор чисел в строку: ");
        Scanner in = new Scanner(System.in);
        String text  = in.nextLine();

        if (text.isBlank()) {
            System.out.println("Введите строку чисел!");
            return;
        }

        String[] numbersArray = text.trim().split(",");

        HashSet<String> numbersSet = new HashSet<>();

        Collections.addAll(numbersSet, numbersArray);

        System.out.println("Уникальные числа: " + numbersSet);
        in.close();
        }
    }