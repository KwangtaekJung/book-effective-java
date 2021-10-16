package book.effective.java.ch02.item02;

import java.util.Set;

public class Item02Main {
    public static void main(String[] args) {

        //직접 Builder 구현 - new 이용
        System.out.println("Hello");
        NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(10, 10)
                .calories(100)
                .fat(100)
                .sodium(200)
                .carbohydrate(300)
                .build();
        System.out.println("nutritionFacts = " + nutritionFacts);

        //직접 Builder 구현 - new를 이용하지 말고 static build 메소드를 이용하자.
        NutritionFacts nutritionFacts1 = NutritionFacts
                .builder(20, 20)
                .calories(100)
                .fat(200)
                .sodium(300)
                .carbohydrate(400)
                .build();
        System.out.println("nutritionFacts1 = " + nutritionFacts1);

        //직접 Builder 구현 - Collection이 포함되어 있는 경우
        NutritionFactsWithCollections nutritionFactsWithCollections = NutritionFactsWithCollections.builder(10, 20)
                .calories(100)
                .fat(200)
                .sodium(300)
                .carbohydrate(400)
                .addSauces("ham")
                .addSauces("red pepper")
                .build();
        System.out.println("nutritionFactsWithCollections = " + nutritionFactsWithCollections);

        //Lombok 사용
        NutritionFactsLombok nutritionFactsLombok = NutritionFactsLombok.builder()
                .servingSize(10)
                .servings(5)
                .fat(100)
                .sodium(200)
                .carbohydrate(300)
                .build();
        System.out.println("nutritionFactsLombok = " + nutritionFactsLombok);

        //Lombok도 new 형태로 이용할 수 있지만, 굳이 이렇게는.... 
        NutritionFactsLombok nutritionFactsLombok1 = new NutritionFactsLombok.NutritionFactsLombokBuilder()
                .servingSize(100)
                .servings(110)
                .calories(1000)
                .fat(5050)
                .sodium(100)
                .carbohydrate(100)
                .build();
        System.out.println("nutritionFactsLombok1 = " + nutritionFactsLombok1);

        //Lombok - Collections 포함된 경우
        NutritionFactsLombokWithCollections nutritionFactsLombokWithCollections = NutritionFactsLombokWithCollections.builder()
                .servingSize(100)
                .servings(110)
                .calories(1000)
                .fat(5050)
                .sodium(100)
                .carbohydrate(100)
                .sauces(Set.of("ham", "mushroom"))
                .build();
        System.out.println("nutritionFactsLombokWithCollections = " + nutritionFactsLombokWithCollections);

        // '계츧적 빌더'를 사용하는 클라이언트 코드
        MyPizza myPizza = new MyPizza.Builder(MyPizza.Size.SMALL)
                .addToping(Pizza.Topping.SAUSAGE)
                .addToping(Pizza.Topping.ONION)
                .build();
        System.out.println("myPizza = " + myPizza);

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addToping(Pizza.Topping.HAM)
                .addToping(Pizza.Topping.MUSHROOM)
                .build();
        System.out.println("calzone = " + calzone);
    }
}
