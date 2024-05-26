public class Duck extends Animals {

    public Duck(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Утка по кличке " + getName() + " летит в облаках");
    }
}
