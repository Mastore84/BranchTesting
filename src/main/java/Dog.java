public class Dog extends Animal{

    public void makeSound(){
        System.out.println("Woof");
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood == true) {
            System.out.println("logrer");
        }
        else if (mood == false) {
            System.out.println("knurrer");
        }
    }
}
