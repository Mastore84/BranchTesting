public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        cat.eat("fish");
        dog.eat("dogfood");

        dog.showMood(true);
        dog.showMood(false);
        cat.showMood(true);
        cat.showMood(false);
    }
}
