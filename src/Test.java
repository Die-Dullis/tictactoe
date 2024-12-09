import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
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
    public static void render1(List<Integer> x){

        for( Integer element: x){
            System.out.println(element);

        }
    }
    public static void render2(List<List<Integer>> list){


        for( List<Integer> x: list){
            System.out.println("beninnig of zug");
            int round = 0;
            for (Integer y : x){
                round = round + 1;
                System.out.println(y);
                if (round == 1){ //x
                    int temp =  y;
                }
                if (round == 2){ //y

                }
                if (round == 3){ // state

                }


            }

        }

    }

    public static void main(String[] args) {
        int defx = 3;
        int defy = 4;
        //mach hier eine list in einer list(jede weitere liste ist ein stück runter) und in jerder liste diser x wert ist die länge des x

        List<Integer> i = input();
        System.out.println(i);

        List<List<Integer>> anotherList = new ArrayList<List<Integer>>();
        List<Integer> hallo= List.of(1,1,1);
        anotherList.add(i);
        anotherList.add(hallo);

        System.out.println(anotherList);
        render2(anotherList);


    }
}