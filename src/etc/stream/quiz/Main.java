package etc.stream.quiz;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        System.out.println("1=======================================================");

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("2=======================================================");

        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("3=======================================================");

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        transactions.stream()
                .filter(transaction -> Objects.equals(transaction.getTrader().getCity(), "Cambridge"))
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getName()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("4=======================================================");

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()   // 문자나 숫자는 Comparator를 사용하지 않아도 된다
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("5=======================================================");

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
//        .equalsIgnoreCase("milan")    // 대소문자 구분없이 비교
        System.out.println("flag = " + flag);

        System.out.println("6=======================================================");

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int total = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();

        System.out.println("total = " + total);
        System.out.println("7=======================================================");

        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getValue)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("8=======================================================");
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);


    }
}
