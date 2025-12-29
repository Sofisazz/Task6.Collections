public class Parrot extends Pet{

    Parrot(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void voice() {
        System.out.println("Карр");
    }

}
