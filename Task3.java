package HomeWork13;

public class Task3 {
    public static void main(String[] args) {
        String a="Hi";
        String b="Bye";



        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println(a);
        System.out.println(b);



    }
}
