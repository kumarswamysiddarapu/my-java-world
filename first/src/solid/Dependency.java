package solid;

public class Dependency {
    public static void main(String[] args) {
        Authority a=new Authority();
        a.getObject(new Gnanambica());
        a.getObject(new MasterMinds());
    }
}
interface University{
    public abstract void departments();

}
class MasterMinds implements University{
    @Override
    public void departments() {
        System.out.println("MasterMinds college from Madanapalli");
        System.out.println("Economics \n mathematis \n Physics \n Commerce");
        System.out.println("------------------------------------------------");
    }
}
class Gnanambica implements University{
    @Override
    public void departments() {
        System.out.println("Gnanambical college from Madanapalli");
        System.out.println("Statiscs \n Physics \n Electronics \n Commerce");
        System.out.println("-----------------------------------------------");
    }
}
class Authority{
    University university;
   public void getObject(University university){
       this.university=university;
       university.departments();
   }

}
