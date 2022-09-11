

class Generics <T> {
    T num1;
    T num2;
    T num3;

    public Generics() {
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
public class UC1{
    public static void main(String[] args) {

        Generics<Integer> obj = new Generics<>();
        obj.calculateMax(5,8,3);
    }
}