import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

   private final SortedMap<Customer, String> map = new TreeMap<>();
   private  int sizeMap;

    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk


        Map.Entry<Customer, String> minEntry = null;
        for (Map.Entry<Customer, String> entry : map.entrySet()) {
            if (minEntry == null || entry.getKey().getScores() < minEntry.getKey().getScores()) {


                Map.Entry<Customer, String> smallEntry = new Map.Entry<Customer, String>() {
                    @Override
                    public Customer getKey() {
                        Customer customer = new Customer(entry.getKey().getId(), entry.getKey().getName(),
                                entry.getKey().getScores());

                        return customer;
                    }

                    @Override
                    public String getValue() {
                        return entry.getValue();
                    }

                    @Override
                    public String setValue(String value) {
                        return null;
                    }
                };
                minEntry = smallEntry;

            }
        }



    //   return null; // это "заглушка, чтобы скомилировать"
        return minEntry;

    }

    public Map.Entry<Customer, String> getNext(Customer customer) {

     Map.Entry<Customer, String> nextEntry = null;
     var scor = customer.getScores();
     boolean foundNext = false;


        for(Map.Entry<Customer, String> entry : map.entrySet()){
            if( scor < entry.getKey().getScores()){
                if(!foundNext) {
                    nextEntry = entry;
                    foundNext =true;
                }

            }
               if(!foundNext) nextEntry = entry;

        }

        sizeMap--;

        if (sizeMap == 0){
            return null;}
        else{
            return nextEntry;
            }

        }



    public void add(Customer customer, String data) {
        System.out.println(customer.getName() + " - " + customer.hashCode());
      map.put(customer,data);

      sizeMap = map.size();

    }
}