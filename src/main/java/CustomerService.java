import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

   private SortedMap<Customer, String> map = new TreeMap<>();


    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk

        Map.Entry<Customer, String> minEntry = null;
        for (Map.Entry<Customer, String> entry : map.entrySet()) {
            if (minEntry == null || entry.getKey().getScores() < minEntry.getKey().getScores()) {
                minEntry = entry;
            }
        }

    //   return null; // это "заглушка, чтобы скомилировать"
        return minEntry;

    }

    public Map.Entry<Customer, String> getNext(Customer customer) {


        Map.Entry<Customer, String>   nextEntry =    map.entrySet().iterator().next();
        return nextEntry;

         }



    public void add(Customer customer, String data) {

      map.put(customer,data);
    }
}