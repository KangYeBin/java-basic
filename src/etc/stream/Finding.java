package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        // 음식 메뉴 중에 칼로리가 500 이상이면서 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean flag1 = menuList.stream()
                .filter(dish -> dish.getCalories() >= 500)
                .anyMatch(Dish::isVegetarian);

        System.out.println("flag1 = " + flag1);

        // 음식 메뉴 중에 칼로리가 50미만인 음식이 있는가?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);

        System.out.println("flag2 = " + flag2);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만인가?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);

        System.out.println("flag3 = " + flag3);

        // 음식 메뉴 중에 모든 요리가 100칼로리 미만이 아닌가?
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 100);

        System.out.println("flag4 = " + flag4);

        // 음식 중에 칼로리가 제일 낮은 음식은?
//        Dish dish = menuList.stream()
//                .min((o1, o2) -> o1.getCalories() - o2.getCalories())
//                .get();

        Dish dish = menuList.stream()
                .min(Comparator.comparing(Dish::getCalories))
                .get();

        System.out.println("dish = " + dish);

        // 음식 중에 칼로리가 제일 높은 음식은?
        Dish dish2 = menuList.stream()
                .max(Comparator.comparing(Dish::getCalories))
                .get();

        System.out.println("dish2 = " + dish2);

    }
}
