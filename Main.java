import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> whoWantsWhat = new HashMap<>();
        whoWantsWhat.put("Karol", "Pizza");
        whoWantsWhat.put("Agnieszka", "Krewetki");
        whoWantsWhat.put("Roman", "Burger");

        System.out.println(whoWantsWhat);
        Set<String> keys = whoWantsWhat.keySet();
        System.out.println(keys);

        Collection<String> values = whoWantsWhat.values();
        System.out.println(values);

        boolean containsKey = whoWantsWhat.containsKey("Krzysiek");
        System.out.println(containsKey);

        boolean containsValue = whoWantsWhat.containsValue("Curry");
        System.out.println(containsValue);

        String result = whoWantsWhat.get("Karol");
        System.out.println(result);

        boolean result2 = whoWantsWhat.isEmpty();
        System.out.println(result2);

        whoWantsWhat.clear();
        System.out.println(whoWantsWhat);

        boolean result3 = whoWantsWhat.isEmpty();
        System.out.println(result3);

        whoWantsWhat.put("Karol", "Pizza");
        whoWantsWhat.put("Agnieszka", "Krewetki");
        whoWantsWhat.put("Roman", "Burger");

        for (Map.Entry<String, String> entry : whoWantsWhat.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}