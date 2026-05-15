package solid;

import java.util.Arrays;

public interface Integretion {
    public static void main(String[] args) {
     Helper h=new Helper(new Printing());
     h.type();
     h=new Helper(new Scanning());
     h.type();
     h=new Helper(new Writing());
     h.type();
     int[] i={1,2,3,4,5,6,7,8,9,10};
     System.out.println(i);
     System.out.println(Arrays.toString(i));

    }
}

// TO PREVENT THE FORCING NATURE OF AN ENTITY OR TYPE WE NEED TO PROVIDE POSSIBLE
//ENTITIES FOR POSSIBLE SAME BEHAVIOURS .
//SO ENTITIES ARE GOING TO WORK AS INDEPENDENT THAT IT PROVIDES FLEXIBILITY TO THE SYSTEM.

interface CopyMeterial{
    void copy();
}
interface Scanner extends CopyMeterial{
    void copy();
}
interface  Printer extends CopyMeterial{
    void copy();
}
interface Writer extends CopyMeterial{
    void copy();
}
class Printing implements Printer{
    @Override
    public void copy() {
        System.out.println("Printer is Implemented");
        System.out.println("-----------------------");
    }
}
class Writing implements Writer{
    @Override
    public void copy() {
        System.out.println("Writer is  Implemented");
        System.out.println("---------------------");
    }
}
class Scanning implements Scanner{
    @Override
    public void copy() {
        System.out.println("Scanner is Implemented");
        System.out.println("-------------------");
    }
}
class Helper{
    CopyMeterial copy;
    Helper(CopyMeterial copy){
        this.copy = copy;
    }
    public void type(){
        copy.copy();
    }
}
