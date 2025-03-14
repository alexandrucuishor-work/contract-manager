package nl.rabobank.hackathon.sol.contractmanager.service;

import nl.rabobank.hackathon.sol.contractmanager.model.Contract;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContractService {

    private final AccessService accessService;

    public Contract getContractDetails(String contractId) {
        accessService.verifyAccess(contractId);
        return new Contract();
    }
}
