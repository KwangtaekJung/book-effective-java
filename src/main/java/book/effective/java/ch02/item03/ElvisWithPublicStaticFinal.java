package book.effective.java.ch02.item03;

public class ElvisWithPublicStaticFinal {

    public static final ElvisWithPublicStaticFinal INSTANCE = new ElvisWithPublicStaticFinal();

    private ElvisWithPublicStaticFinal() {
        //...
    }

    public void leaveTheBuilding() {
        //...
    }
}
