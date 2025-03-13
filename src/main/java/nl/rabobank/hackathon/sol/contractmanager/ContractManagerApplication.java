package nl.rabobank.hackathon.sol.contractmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContractManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractManagerApplication.class, args);
    }

    /* TODO: Implement the following security checks in semgrep:
     1) Check for access service verification
     2) check only for endpoints containing resource id in their URIs -> retrieving static resources
     3) check for validation annotations for each endpoint payload & params
     4) check for resources id predictability (must be UUID)
    */

}
