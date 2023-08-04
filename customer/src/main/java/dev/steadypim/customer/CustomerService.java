package dev.steadypim.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstname())
                .lastName(request.lastname())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
