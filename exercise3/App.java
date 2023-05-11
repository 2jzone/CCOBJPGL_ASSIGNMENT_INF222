package Dog;

public class App {
    public static void main(String[] args) throws Exception {
        BlackAmerican myPet = new BlackAmerican();

        myPet.bark();
        myPet.hide();
        System.out.println("Eye color: " + myPet.eyeColor);
        System.out.println("Height: " + myPet.height);
    }
}
