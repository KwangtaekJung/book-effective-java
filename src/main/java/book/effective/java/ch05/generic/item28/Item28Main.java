package book.effective.java.ch05.generic.item28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * choose 메서드를 호출할때마다 반환된 Object를 원하는 타입으로 형변환해야 한다.
 * 타입이 다른 요소가 들어 있다면 런타임에 형변환 오류가 발생할 수 있다.
 */
public class Item28Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        Chooser chooser = new Chooser(integerList);
        Object choose = chooser.choose();
        System.out.println("choose = " + choose);

        GenericTypeA<String> t1 = new GenericTypeA<>("t1");

        //ERROR: Generic array creation
//      GenericTypeA<String>[] genericTypeAS = new GenericTypeA<String>[]{t1};

        //배열 대신 리스트를 사용해야 한다.
        List<GenericTypeA<String>> genericTypeAList = new ArrayList<>();
        genericTypeAList.add(t1);
        System.out.println("genericTypeAList.get(0).getT() = " + genericTypeAList.get(0).getT());
    }
}
