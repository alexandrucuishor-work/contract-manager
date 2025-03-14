package nl.rabobank.hackathon.sol.contractmanager.controller;

import nl.rabobank.hackathon.sol.contractmanager.model.Customer;
import nl.rabobank.hackathon.sol.contractmanager.service.CustomerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(path = "/${customerId}", produces = "application/json")
    public Customer getCustomer(@PathVariable final String customerId) {
        return customerService.getCustomer(customerId);

    }

}
