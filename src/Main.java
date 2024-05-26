public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.

        Animals dog = new Dog("Барсик", 3, 10);
        dog.move();
        dog.walk();

        Animals duck = new Duck("Вилли", 2, 1);
        duck.move();
        duck.walk();

    }
}
