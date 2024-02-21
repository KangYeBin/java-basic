package basic.datatype;

public class FloatExample {

    public static void main(String[] args) {

        // 실수 리터럴의 기본 데이터 타입은 double
        float f1 = 7.12345F;
        double d1 = 7.12345;
        
        float f2 = 1.234567891234F; // 1.2345679로 반올림해서 출력
        double d2 = 1.234567891234;

        System.out.println("f2 = " + f2);   // float은 소수점 이하 7자리까지만 출력
        System.out.println("d2 = " + d2);
    }
}
