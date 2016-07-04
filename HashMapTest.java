import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, Boolean> hashmap = new HashMap<String, Integer>();

        hashmap.put("paul", 28);
        hashmap.put("sino", 28);
        hashmap.put("zill", 24);

        int age = hashmap.get("zill");

        if (hashmap.containsKey("jay")) {
            System.out.println(hashmap.get("jay"));
        } else {
            hashmap.put("jay", 100);
        }

        System.out.println(hashmap.get("jay"));
    }
}