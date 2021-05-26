package homework3core;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        Box<Orange> oran = new Box<>();
        Box<Orange> oran1 = new Box<>();
        Box<Apple> appl = new Box<>();
        Box<Apple> appl1 = new Box<>();
        System.out.println("Task3");
        System.out.println("'g' - addFruit: ");
        oran.addFruit(new Orange(),14);
        oran1.addFruit(new Orange(),10);
        appl.addFruit(new Apple(),8);
        appl1.addFruit(new Apple(),2);
        System.out.println("Box 1: "+oran.getWeight());
        System.out.println("Box 2: "+oran1.getWeight());
        System.out.println("Box 3: "+appl.getWeight());
        System.out.println("Box 4: "+appl1.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: "+oran.compare(appl));
        System.out.println("Box 2 equals box 4: "+oran1.compare(appl1));
        System.out.println("'f' - pourTo(): ");
        oran.pourTo(oran1);
        appl.pourTo(appl1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: "+oran.getWeight());
        System.out.println("Box 2: "+oran1.getWeight());
        System.out.println("Box 3: "+appl.getWeight());
        System.out.println("Box 4: "+appl1.getWeight());
    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Task1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("результат замены: "+Arrays.toString(arr)+"\n================================");
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Task2 и результат преобразования : "+alt+"\n================================");
    }
    }

