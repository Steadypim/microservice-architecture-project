package dev.steadypim.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) {
}
