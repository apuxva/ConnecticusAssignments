interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Amphibian implements Flyable, Swimmable{
    public void fly(){
        System.out.println("Amphibian is Flying");
    }
    public void swim(){
        System.out.println("Amphibian is Swimming");
    }
}

@SuppressWarnings("unused")
class AmphibianTest {
    public static void main(String[] args) {
        Amphibian a = new Amphibian();
        a.fly();
        a.swim();
    }
}