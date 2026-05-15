package exceptionhandling;

import java.util.Arrays;

public class Finally_Block {
    public static void main(String[] args) {
      System.out.println(m1());
    }
    public static int  m1(){
        try{
            System.out.println("kumar swamy");
          return 1;
        }catch (Exception ignored){

        }
        finally{
            return 2;
        }
    }
}
