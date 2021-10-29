public class DogClient {
    public static void main(String[] args) {
        Dog p1 = new Dog("Buccs", 3, "mediumDog");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.toString());
        p1.makeNoise();
        p1.setBreed("bigDog");
        p1.setAge(5);
        p1.setName("Kiki");
        System.out.println(p1.toString());
    }
}