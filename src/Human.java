public class Human {

 int age;
 String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

        Cinderella cinderella = new Cinderella(23, "erika", 41);
        Prince prince = new Prince(28, "sergio", 37);

        System.out.println(prince.findCindy(cinderella.shoeSize));

    }
}
