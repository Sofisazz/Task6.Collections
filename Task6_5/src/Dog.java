public class Dog extends Pet{

    Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void voice() {
        System.out.println("Гаф");
    }
}
