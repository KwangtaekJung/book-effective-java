package book.effective.java.ch02.item02;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)  //@Builder를 사용하면 전체 인자를 갖는 생성자를 자동으로 만들어준다. 이때 이렇게 private로 선언하도록 만들어주면 생성자로는 인스턴스를 생성하지 못하도록 막을 수 있다.
@ToString
public class NutritionFactsLombok {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

}
