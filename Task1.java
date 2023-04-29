package HomeWork13;

public class Task1 {
    public static void main(String[] args) {

        String str = "This is the sentence I want to reverse";
        String [] arr = str.split(" ");


        for (String str2 : arr) {
            for (int i =str2.length()-1; i>=0 ; i--) {
                System.out.print(str2.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
