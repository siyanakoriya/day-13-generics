
public class UC2_float<T> {
    T num1;
    T num2;
    T num3;

    public UC2_float(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static <T extends Comparable<T>>void calculateMax (T num1, T num2, T num3)
    {
        if (num1.compareTo(num2)>=0 && num1.compareTo(num2)>=0) {
            System.out.println(num1+" Num1 is largest number.");
        } else if (num2.compareTo(num1)>=0 && num2.compareTo(num3)>=0) {
            System.out.println(num2+" Num2 is largest number.");
        } else {
            System.out.println(num3+" Num3 is largest number.");
        }
    }
}
class UC2{
    public static void main(String[] args) {

        Generics<Float> obj = new Generics<>();
        obj.calculateMax(26.3,44.5,55.6);
    }
}