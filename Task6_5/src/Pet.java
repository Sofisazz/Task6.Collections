public abstract class Pet {

    private String name;
    private int age;
    private String breed;

    Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void voice(){};
}
