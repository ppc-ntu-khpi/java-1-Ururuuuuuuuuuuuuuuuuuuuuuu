package src.Test;

import src.domain.Customer;

public class CustomerTest {
    public static void main (String[] args){
        Customer customer = new Customer(4,false, 1001);
        customer.displayCustomerInfo();
        customer.setID(3);
        customer.setNew(true);
        customer.setTotal(654);
        System.out.println(" ");
        customer.displayCustomerInfo();
    }
}
