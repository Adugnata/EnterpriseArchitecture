package bank.adapter;

import bank.domain.Customer;
import bank.dto.CustomerDTO;

public class CustomerAdapter {
    public static Customer getCustomerFromCustomerDTO(CustomerDTO customerDto){
        return new Customer(customerDto.getName());
    }
    public static CustomerDTO getCustomerDTOFromCustomer(Customer customer){
        return new CustomerDTO(customer.getName());
    }
}
