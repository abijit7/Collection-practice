package hashMapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Qno3 {
    static void main() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Satyarth", "Kathmandu"));
        customers.add(new Customer(2, "Rohit", "Lalitpur"));
        customers.add(new Customer(3, "Soham", "Bhaktapur"));
        customers.add(new Customer(4, "Hari", "Kathmandu"));
            Map<String,List<Customer>> groupedCustomers = group(customers);
            System.out.println(groupedCustomers);
    }
     public static Map<String,List<Customer>> group(List<Customer> customers){
        return customers.stream().collect(Collectors.groupingBy(Customer::getDistrict));

    }
}

