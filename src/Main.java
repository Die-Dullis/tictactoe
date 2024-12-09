import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x");
        int x = scanner.nextInt();

        System.out.println("y");
        int y = scanner.nextInt();

        System.out.println("state");
        int state = scanner.nextInt();

        List<Integer> list= Arrays.asList(x, y, state);
        scanner.close();

        return list;
    }

    public static void main(String[] args) {
        List<Integer> i = input();
        System.out.println(i);

        List<List<Integer>> anotherList = new ArrayList<List<Integer>>();
        List<Integer> hallo= List.of(1);
        anotherList.add(i);
        anotherList.add(hallo);

        System.out.println(anotherList);


    }
}