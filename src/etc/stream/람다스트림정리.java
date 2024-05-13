package etc.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 람다스트림정리 {

    public static List<String> getHealthyDishName(List<Dish> menu) {
        // 요리 목록에서 칼로리가 400보다 작은 요리만 추출해서
        // 칼로리가 낮은 순으로 오름차 정렬 후 이름만 추출해서 리스트로 만들기

        // 스트림 사용하지 않은 코드
        List<Dish> lowCalrorieDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCalrorieDishes.add(dish);
            }
        }

        lowCalrorieDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });

        // 정렬된 리스트에서 이름만 뽑은 리스트를 만들자
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : menu) {
            dishNames.add(dish.getName());
        }

        return dishNames;
    }

    public static List<String> getHealthyDishName2(List<Dish> menu) {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> dishName1 = getHealthyDishName((Menu.menuList));
        System.out.println("dishName1 = " + dishName1);

        List<String> dishName2 = getHealthyDishName((Menu.menuList));
        System.out.println("dishName2 = " + dishName1);
    }
}
