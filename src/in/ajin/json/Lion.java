package in.ajin.json;

public class Lion extends Animal implements Predator, Barkable {
    public void bark() {
        System.out.println("으르렁");
    }
    public String getName() {
        return this.name;
    }
}