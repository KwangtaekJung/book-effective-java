package book.effective.java.ch02.item03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("private 생성자 타입이나 열거 타입으로 싱글턴임을 보장하라")
class SingletonTest {

    @Test
    @Order(10)
    @DisplayName("public static final 필드 방식의 싱글턴")
    public void singleton_PublicStaticFinal() {
        ElvisWithPublicStaticFinal elvisWithPublicStaticFinal1 = ElvisWithPublicStaticFinal.INSTANCE;
        ElvisWithPublicStaticFinal elvisWithPublicStaticFinal2 = ElvisWithPublicStaticFinal.INSTANCE;

        System.out.println("elvisWithPublicStaticFinal1 = " + elvisWithPublicStaticFinal1);
        System.out.println("elvisWithPublicStaticFinal2 = " + elvisWithPublicStaticFinal2);

        assertThat(elvisWithPublicStaticFinal1).isEqualTo(elvisWithPublicStaticFinal2);
    }

    @Test
    @Order(11)
    @DisplayName("public static final 필드 방식의 싱글턴 - 예외: reflection")
    public void singleton_PublicStaticFinal_reflaction() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ElvisWithPublicStaticFinal singletonInstance = ElvisWithPublicStaticFinal.INSTANCE;
        System.out.println("singletonInstance = " + singletonInstance);
        ElvisWithPublicStaticFinal singletonReflection;

        Constructor<ElvisWithPublicStaticFinal> constructor = ElvisWithPublicStaticFinal.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        singletonReflection = constructor.newInstance();
        System.out.println("singletonReflection = " + singletonReflection);

        assertThat(singletonInstance).isNotEqualTo(singletonReflection);
    }

    @Test
    @Order(20)
    @DisplayName("정적 팩토리 방식의 싱글턴")
    public void singleton_StaticFactory() {
        ElvisWithStaticFactory elvisWithStaticFactory1 = ElvisWithStaticFactory.getInstance();
        ElvisWithStaticFactory elvisWithStaticFactory2 = ElvisWithStaticFactory.getInstance();

        System.out.println("elvisWithStaticFactory1 = " + elvisWithStaticFactory1);
        System.out.println("elvisWithStaticFactory2 = " + elvisWithStaticFactory2);

        assertThat(elvisWithStaticFactory1).isEqualTo(elvisWithStaticFactory2);
    }
}