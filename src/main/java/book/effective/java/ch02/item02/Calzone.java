package book.effective.java.ch02.item02;

public class Calzone extends Pizza {
    private final boolean sauaceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        //필수 매개변수로 받고 싶으면 생성자를 이용한다.
//        public Builder(boolean sauceInside) {
//            this.sauceInside = sauceInside;
//        }

        //선택 매개변수로 설정할 경우
        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauaceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauaceInside=" + sauaceInside +
                ", toppings=" + toppings +
                '}';
    }
}
