public class Dog extends Animal{

    public void makeSound(){
        System.out.println("Woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
