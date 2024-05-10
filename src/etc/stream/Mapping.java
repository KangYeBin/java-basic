package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Mapping {

    // 이름과 칼로리만 가진 클래스를 설계
    private static class SimpleDish {
        private String name;
        private int calories;

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }

    private static class DishNameType {
        private String name;
        private Dish.Type type;

        public DishNameType(String name, Dish.Type type) {
            this.name = name;
            this.type = type;
        }

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }


    public static void main(String[] args) {

        // stream의 map : 컬렉션(List, Set, Map)에서
        // 원하는 정보만 추출하여 새로운 컬렉션으로 반환

        List<Integer> caloriesList = menuList.stream()
//                .map(dish -> dish.getCalories())
                .map(Dish::getCalories)     // 메서드 참조 단축 문법
                .collect(toList());

        System.out.println("caloriesList = " + caloriesList);

        System.out.println("====================================================");

        // 요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다
        menuList.stream()
//                .map(dish -> new SimpleDish(dish))
                .map(SimpleDish::new)
                .collect(toList())
//                .forEach(simpleDish -> System.out.println("simpleDish = " + simpleDish));
                .forEach(System.out::println);

        System.out.println("====================================================");

        // 요리 목록에서 칼로리가 500칼로리보다 큰 음식들을 필터링한 후에
        // 음식의 이름과 타입만 추출해서 출력하기 (DishNameType)
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
//                .map(dish -> new DishNameType(dish))
                .map(DishNameType::new)
                .collect(toList())
                .forEach(System.out::println);
//                .forEach(dishNameType -> System.out.println("dishNameType = " + dishNameType));

        System.out.println("====================================================");


    }
}
