public class Dog extends Animals {


    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Собака по кличке " + getName() + " бежит по земле");
    }
}
