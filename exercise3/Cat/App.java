package Cat;
public class App {
    public static void main(String[] args) throws Exception {
        BritishBombay myPet = new BritishBombay();

        myPet.meow();
        myPet.collect();
        System.out.println("Eye color: " + myPet.eyeColor);
        System.out.println("Height: " + myPet.height);
    }
}
