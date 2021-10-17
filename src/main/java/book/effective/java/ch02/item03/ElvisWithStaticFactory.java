package book.effective.java.ch02.item03;

public class ElvisWithStaticFactory {

    private static final ElvisWithStaticFactory INSTANCE = new ElvisWithStaticFactory();
    private ElvisWithStaticFactory() {
        //...
    }
    public static ElvisWithStaticFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        //...
    }
}
