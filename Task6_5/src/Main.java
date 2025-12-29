import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        Pet maineCoon = new Cat("Мили", 5, "Мейк-кун");
        Pet sphynx  = new Cat("Вилли", 1, "Сфинкс");

        Pet bulldog = new Dog("Рик", 8, "Бульдог");
        Pet labrador = new Dog("Шилко", 10, "Лабрадор");

        Pet cockatoos = new Parrot("Энди", 30, "Какаду");
        Pet lovebirds = new Parrot("Цици", 7, "Неразлучники");

        HashMap<String, Pet> petsMap = new HashMap<>();

        petsMap.put(maineCoon.getName(), maineCoon);
        petsMap.put(sphynx.getName(), sphynx);

        petsMap.put(bulldog.getName(), bulldog);
        petsMap.put(labrador.getName(), labrador);

        petsMap.put(cockatoos.getName(), cockatoos);
        petsMap.put(lovebirds.getName(), lovebirds);

        printKeysMap(petsMap);
    }

    public static void printKeysMap(HashMap<String, Pet> pets) {
        for (String key : pets.keySet()) {
            System.out.printf("Ключ отображения: %s", key);
            System.out.println();
        }
    }
}