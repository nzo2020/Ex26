public class Dog extends Animal implements Runnable {

    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    @Override
    public void eat() {
        System.out.println("Algae");
    }

    @Override
    public void run() {
        System.out.println("The dog is running");
    }
}