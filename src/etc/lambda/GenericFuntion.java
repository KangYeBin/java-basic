package etc.lambda;

@FunctionalInterface
public interface GenericFuntion<X,Y> {

    // X에서 Y 추출
    Y apply(X x);
}
