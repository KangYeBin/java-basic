package etc.lambda;

import java.util.List;

import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.filter;
import static etc.lambda.MappingApple.map;
import static etc.lambda.MappingApple.mappingAppleByColor;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========= 녹색 사과 필터링 =========");

        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("========= 다양한 색상의 사과 필터링 =========");
        List<Apple> filteredColorApples = FilterApple.filterAppleByColor(appleBasket, YELLOW);
        for (Apple filteredColorApple : filteredColorApples) {
            System.out.println(filteredColorApple);
        }

        System.out.println("========= 원하는 조건의 사과 필터링 =========");
        List<Apple> apples1 = FilterApple.filterApple(appleBasket, new LightApplePredicate());

        // 100g 이하의 사과 필터링
        for (Apple apple : apples1) {
            System.out.println(apple);
        }

        System.out.println("==============================");
        // 익명 클래스 (anonymous class)
        // new 인터페이스 타입() 문법으로 즉석에서 선언하여 사용하는 클래스
        // 선언부에 추상 메서드 오버라이딩을 즉시 선언하여 사용

        // 빨강이나 노랑 사과 필터링
        List<Apple> apples2 = FilterApple.filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });

        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        System.out.println("==============================");
        // 초록이면서 100g 이상인 사과만 필터링
        // 인터페이스를 구현하는 익명 클래스를 람다식으로 선언
        // 인터페이스의 추상 메서드가 반드시 단 하나일 경우에만 가능
        // 구현하고자 하는 추상 메서드 내부 로직이 한 줄일 경우 중괄호와 리턴 생략 가능

        List<Apple> apples3 = FilterApple.filterApple(appleBasket,
                (apple -> apple.getWeight() >= 100 && apple.getColor() == GREEN));

        for (Apple apple : apples3) {
            System.out.println(apple);
        }

        System.out.println("==============================");
        // 색이 빨강 혹은 초록이면서 150g 미만인 사과만 필터링
        List<Apple> apples4 = FilterApple.filterApple(appleBasket,
                (apple -> apple.getWeight() < 150 && (apple.getColor() == GREEN || apple.getColor() == RED)));

        for (Apple apple : apples4) {
            System.out.println(apple);
        }


        System.out.println("================ 여러 가지 타입의 객체 필터링 ==============");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter1 = filter(numbers, n -> n%2 == 1);
        System.out.println("filter1 = " + filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살");
        List<String> filter2 = filter(foods, f -> f.length() == 3);
        System.out.println("filter2 = " + filter2);

        List<Apple> filter3 = filter(appleBasket, apple -> apple.getWeight() < 100);
        System.out.println("filter3 = " + filter3);

        System.out.println("================ 사과의 색상만 매핑 ==============");
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("================ 숫자에서 제곱수를 매핑 ==============");
        List<Integer> map1 = map(numbers, n -> n * n);
        System.out.println("map1 = " + map1);

        System.out.println("================ 문자의 첫글자만 매핑 ==============");
        List<Character> map2 = map(foods, f -> f.charAt(0));
        System.out.println("map2 = " + map2);

        System.out.println("================ 사과에서 무게만 매핑 ==============");
        List<Integer> map3 = map(appleBasket, a -> a.getWeight());
        System.out.println("map3 = " + map3);
    }
}
