package nl.rabobank.hackathon.sol.contractmanager.config;

import jakarta.validation.ConstraintValidator;

public class ContractLinkConstraint implements ConstraintValidator<IsLinkedToUser, String> {

    @Override
    public boolean isValid(String value, jakarta.validation.ConstraintValidatorContext context) {
        // check if the contract belongs to the user
        return true;
    }
}
