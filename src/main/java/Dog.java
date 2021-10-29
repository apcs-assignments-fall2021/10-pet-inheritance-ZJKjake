public class Dog extends Pet {
    // Instance variable(s)
    private String breed;


    // Constructors
    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }

    public Dog(String a, int b) {
        super(a,b);
        this.breed = "Smalldog";
    }


    public Dog() {
        super("Dimi", 3);
        this.breed = "Bigdog";
    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("woo");
    }

    // toString method
    public String toString() {
        String str = this.getName() + " " + this.getAge() + ", " + this.breed;
        return str;
    }
    // Getter

    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed){
        this.breed=breed;
    }

}