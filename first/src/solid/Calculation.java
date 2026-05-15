package solid;

public class Calculation {
    public static void main(String[] args) {
        Calculator c = new Calculator();
       System.out.println(c.add(1,2,3,4,5,6,7,8,9,10));
       System.out.println("--------------addition completed--------------");
       c.subtract(2,3,4,5,6,7,8,9,10);
       System.out.println("--------------subtraction completed--------------");
       c.multiply(2,3,4,5,6,7,8,9,10);
       System.out.println("--------------multiplication completed--------------");
       c.divide(2,3);
       System.out.println("--------------divide completed--------------");
    }
}
class Calculator{
    public int add(int... x ){
        int sum = 0;
        for (int i : x){
            sum += i;
        }
       return sum;
    }
    public void subtract(int... x){
        int sum=add(x);
        for(int i:x){
            if(i%2==0){
                sum-=i;
            }
        }
        System.out.println(sum);
    }
    public void multiply(int... x){
        int sum=1;
        for(int i:x){
            sum*=i;
        }
        System.out.println(sum);
    }
    public void divide(int x, int y){
        int sum=add(x,y);
        System.out.println(sum/x);
        System.out.println(sum/y);
    }
}
