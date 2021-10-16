package book.effective.java.ch02.item02;

import java.util.HashSet;
import java.util.Set;

public class NutritionFactsWithCollections {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    private final Set<String> sauces;

    public static NutritionFactsWithCollections.Builder builder(int servingSize, int servings) {
        return new NutritionFactsWithCollections.Builder(servings, servings);
    }

    public static class Builder {
        //필수 매개변수
        private final int servingSize;
        private final int servings;

        //선택 매개변수 - 기본값으로 초기화한다.
        private int calories = 0;
        private int fat =0;
        private int sodium = 0;
        private int carbohydrate = 0;
        private final Set<String> sauces = new HashSet<>();

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }
        public Builder fat(int val) {
            this.fat = val;
            return this;
        }
        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }
        public Builder addSauces(String sauce) {
            this.sauces.add(sauce);
            return this;
        }

        public NutritionFactsWithCollections build() {
            return new NutritionFactsWithCollections(this);
        }
    }

    private NutritionFactsWithCollections(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
        sauces = builder.sauces;
    }

    @Override
    public String toString() {
        return "NutritionFactsWithCollections{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                ", sauces=" + sauces +
                '}';
    }
}
