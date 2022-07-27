import java.util.LinkedHashMap;
import java.util.Map;

public class TestHomeWork {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("Ivanov","11");
        map.put("Petrov","113");
        map.put("Sidorov","116");
        map.put("Chernov","4");
        /*
        Map.Entry<Customer, String> minEntry = null;
        for (Map.Entry<Customer, String> entry : map.entrySet()) {
            if (minEntry == null || entry.getKey().getScores() < minEntry.getKey().getScores()) {
                minEntry = entry;
            }
        }


         */


        for (Map.Entry<String, String> customer: map.entrySet()) {
            System.out.println("key: " + customer.getKey() + " value: " + Integer.parseInt(customer.getValue()) + " hash " + customer.getKey().hashCode());

        }

        Map.Entry<String, String> minEntry = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (minEntry == null || Integer.parseInt(entry.getValue()) < Integer.parseInt(minEntry.getValue())) {
                minEntry = entry;
            }
        }
        System.out.println(minEntry.getValue());

    }
}
