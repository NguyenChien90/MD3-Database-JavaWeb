package rikkei.academy.service;
import rikkei.academy.model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceIMPL implements ICustomerService{
    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Nam", "nam@rikkei.academy", "Hanoi"));
        customers.put(2, new Customer(2, "Dung", "dung@rikkei.academy", "Danang"));
        customers.put(3, new Customer(3, "Viet", "viet@rikkei.academy", "Saigon"));
        customers.put(4, new Customer(4, "Diep", "diep@rikkei.academy", "Beijin"));
        customers.put(5, new Customer(5, "Hoai", "hoai@rikkei.academy", "Miami"));
        customers.put(6, new Customer(6, "Linh", "linh@rikkei.academy", "Newyork"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customer.setId(getNewId());
        customers.put(getNewId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }

    public int getNewId(){ // phương thức dùng để tạo id mới tự tăng
        int idMax = 0;
        for (Map.Entry e : customers.entrySet()){
             int id = (int) e.getKey();
            if (id > idMax){
                idMax = id;
            }
        }
        return idMax + 1;
    }

}
