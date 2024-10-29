public class Bird extends Animal implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void eat() {
        System.out.println("Seeds");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}