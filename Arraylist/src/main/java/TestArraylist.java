import java.util.ArrayList;
import java.util.Iterator;

public class TestArraylist {

    public static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("Giang");
        list.add("Tuan");
        list.add("Ha");
        System.out.println("===========================");
        showList();
        System.out.println("===========================");
        System.out.println("Delete the 2st member!");
        list.remove(1);
        showList();
        System.out.println("===========================");
        System.out.println("Check if it contains\"Giang\" ");

        check();
        System.out.println("===========================");
        System.out.println("Clear list!");
        clearList();
    }

    private static void clearList() {
        list.clear();
        if (list.size() == 0) System.out.println("List is empty!");
        else  System.out.println("List is not empty!");
    }

    private static void check() {
        if (list.contains("Giang")) System.out.println("Yes!");
        else System.out.println("No!");
    }

    private static void showList() {
        System.out.println("List member: ");
        for (String name : list){
            System.out.println(name);
        }
    }

}
