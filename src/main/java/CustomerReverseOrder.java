import java.util.LinkedList;

public class CustomerReverseOrder <T> {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    // private  final  ArrayList <Customer> arrayList = new ArrayList<>();
    private  final LinkedList linkedList = new LinkedList();


    public void add(Customer customer) {
        this.linkedList.addLast(customer);
    //  this.arrayList.add( customer);
    }

    public Customer take() {
       // return null; // это "заглушка, чтобы скомилировать"
        return (Customer) this.linkedList.removeLast();

    }
}
