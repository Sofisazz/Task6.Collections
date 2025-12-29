public class Cat extends Pet{

    Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
