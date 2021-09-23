package book.effective.java.ch05.generic.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 배열보다는 리스트를 사용하여 비검사 형변환 경고를 제거한다.
 * @param <T>
 */
public class ChooserGeneric<T> {
//  private final T[] choiceArray;
    private final List<T> choiceArray;

    public ChooserGeneric(Collection<T> choiceArray) {
//      this.choiceArray = (T[]) choiceArray.toArray();
        this.choiceArray = new ArrayList<>(choiceArray);
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
//      return choiceArray[rnd.nextInt(choiceArray.length)];
        return choiceArray.get(rnd.nextInt(choiceArray.size()));
    }
}
