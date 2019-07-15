import java.util.HashMap;

public class TestHashMap {
    public static HashMap<Integer, String> list = new HashMap<Integer, String>();

    public static void main(String[] args) {
        list.put(1, "Giang");
        list.put(2, "Nam");
        list.put(3, "Ha");

        System.out.println("==========================");
        showList();

        System.out.println("Delete the 3rd member");
        list.remove(3);
    }

    private static void showList() {
        for (int i = 1; i <= list.size(); i++){
            System.out.println(i + " " + list.get(i));
        }
    }
}
