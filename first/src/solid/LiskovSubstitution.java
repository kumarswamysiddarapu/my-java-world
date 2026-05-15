package solid;

public class LiskovSubstitution {
    public static void main(String[] args) {
     Bird bird=new Crow() ;
     bird.fly();
     bird=new Parrot();
     bird.fly();
     bird=new Pegion();
     bird.fly();
    }
}
class Bird{
    public void fly(){
        System.out.println("Bird can fly");
    }
}
class Crow extends Bird{
    public void fly(){
        System.out.println("Crow is flying");
    }
}
class Pegion extends Bird{
    public void fly(){
        System.out.println("Pegion is flying");
    }
}
class Parrot extends Bird{
    public void fly(){
        System.out.println("Parrot is flying");
    }
}


