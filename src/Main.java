import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);

        }


        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(fraction[i]);

        }


        int[] months = new int[12];
        for (int index = 0; index < months.length; index++) {
            months[index] = index + 1;
            System.out.println(months[index]);
        }

        System.out.println("Задача 2");

        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }

        for (int index = 0; index < fraction.length; index++) {
            if (index == fraction.length - 1) {
                System.out.println(fraction[index]);
                break;
            }
            System.out.print(fraction[index] + ", ");
        }

        for (int index = 0; index < months.length; index++) {
            if (index == months.length - 1) {
                System.out.println(months[index]);
                break;
            }
            System.out.print(months[index] + ", ");
        }

        System.out.println("Задача 3");

        for (int i = numbers.length - 1;i >= 0;i--){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(", ");

            }
        }
        System.out.println(" ");

        for (int i = fraction.length - 1; i >= 0; i--){
            System.out.print(fraction[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int i = months.length - 1;i >= 0; i--){
            System.out.print(months[i]);
            if(i > 0){
                System.out.print(" ,");
            }
        }

        System.out.println(" ");

        System.out.println("Задача 4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
            System.out.println(Arrays.toString(numbers));





























    }
}