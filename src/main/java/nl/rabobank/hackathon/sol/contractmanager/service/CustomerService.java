package nl.rabobank.hackathon.sol.contractmanager.service;

import nl.rabobank.hackathon.sol.contractmanager.model.Customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer getCustomer(String customerId) {
        return new Customer();
    }
}
