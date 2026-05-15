package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

    }
}
interface Meterial{
   void getMeterial();
}
interface Goods{
    void getGoods();
}
interface Products {
    public Meterial getMeterial();
    public Goods getGoods();
}
class Local implements Products{

    @Override
    public Meterial getMeterial() {
        return null;
    }

    @Override
    public Goods getGoods() {
        return null;
    }
}
class Local_Meterial implements Meterial{
    @Override
    public void getMeterial() {

    }
}
