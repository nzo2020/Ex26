public class Cat extends Animal implements Runnable {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Chicken");
    }

    @Override
    public void run() {
        System.out.println("The cat is running");
    }
}
