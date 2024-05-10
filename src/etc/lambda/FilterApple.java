package etc.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.Locale.filter;

// 사과를 여러 가지 방법으로 필터링
public class FilterApple {

    /**
     * @return - 녹색 사과만 필터링 된 바구니
     * @solution - try 1 : 사과 바구니에서 녹색 사과만 필터링
     * @problom - 만약 다른 색깔의 사과를 필터링 해야한다면 새로운 메서드를 선언해야한다
     * @param1 - 전체 사과가 들어있는 바구니
     */

    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 녹색 사과만 담을 바구니
        List<Apple> greenBasket = new ArrayList<>();

        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }

        return greenBasket;
    }

    /**
     * @solution - try 2 : 색상을 파라미터화
     * @probloem - 만약 색상이 아닌 무게 기준으로 필터링해야한다면?
     */
    public static List<Apple> filterAppleByColor(List<Apple> basket, Color color) {
        // 필터링 된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();

        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredBasket.add(apple);
            }
        }

        return filteredBasket;
    }

    /**
     * @solution - try 3 : 동작을 파라미터화 해서 해결한다
     * - 함수를 전달 받을 수 있다면?
     * - 자바는 함수를 전달할 수 없다
     * -> 콜백 문법을 지원하지 않아서 불가능
     * -> 함수 개념이 아니라 객체에 소속된 메서드 개념
     * <p>
     * - 그런데 전달되는 함수가 고정되어 있는가?
     * -> 필터 조건에 따라 함수 내용이 달라진다
     * -> 어떻게 함수 이름이 통일 되면서 다른 내용을 전달할까?
     * -> 오버라이딩 (상속, 인터페이스)
     */
    public static List<Apple> filterApple(List<Apple> basket, ApplePredicate predicate) {
        // 필터링 된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();

        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if (predicate.test(apple)) {
                filteredBasket.add(apple);
            }
        }

        return filteredBasket;
    }

    /**
     * @solution - try 4 : 제네릭 필터 메서드 생성
     */
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> predicate) {
        // 필터링 된 사과만 담을 바구니
        List<T> filteredBasket = new ArrayList<>();

        // 반복문을 통한 필터링
        for (T t : basket) {
            if (predicate.test(t)) {
                filteredBasket.add(t);
            }
        }

        return filteredBasket;
    }
}
