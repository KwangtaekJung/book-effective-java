package book.effective.java.ch02.item02;

public class MyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE };
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        MyPizza build() {
            return new MyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private MyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "MyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
