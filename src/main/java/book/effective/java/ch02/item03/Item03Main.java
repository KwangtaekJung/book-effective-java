package book.effective.java.ch02.item03;

public class Item03Main {
    public static void main(String[] args) {

        ElvisWithPublicStaticFinal elvisWithPublicStaticFinal1 = ElvisWithPublicStaticFinal.INSTANCE;
        System.out.println("elvisWithPublicStaticFinal1 = " + elvisWithPublicStaticFinal1);

        ElvisWithPublicStaticFinal elvisWithPublicStaticFinal2 = ElvisWithPublicStaticFinal.INSTANCE;
        System.out.println("elvisWithPublicStaticFinal2 = " + elvisWithPublicStaticFinal2);


        ElvisWithStaticFactory elvisWithStaticFactory1 = ElvisWithStaticFactory.getInstance();
        System.out.println("elvisWithStaticFactory1 = " + elvisWithStaticFactory1);

        ElvisWithStaticFactory elvisWithStaticFactory2= ElvisWithStaticFactory.getInstance();
        System.out.println("elvisWithStaticFactory2 = " + elvisWithStaticFactory2);


        Elvis.INSTANCE.leaveTheBuilding();
    }
}