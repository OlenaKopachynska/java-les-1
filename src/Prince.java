public class Prince<foundShoe> extends Human{
    int foundShoe;
    public Prince(int age, String name, int foundShoe) {
        super(age, name);
        this.foundShoe = foundShoe;
    }

    public String findCindy(int shoe) {

        if(foundShoe == shoe) {
            return "My love";
        } else {
            return "No no no";
        }
    }
}
