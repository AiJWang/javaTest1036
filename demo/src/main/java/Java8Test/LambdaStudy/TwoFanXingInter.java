package Java8Test.LambdaStudy;

@FunctionalInterface
public interface TwoFanXingInter<T,K> {
    K getk(T t,K k);
}
