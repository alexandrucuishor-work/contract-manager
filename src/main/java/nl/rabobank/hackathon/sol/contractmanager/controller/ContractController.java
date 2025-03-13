package nl.rabobank.hackathon.sol.contractmanager.controller;

import jakarta.validation.Valid;

import nl.rabobank.hackathon.sol.contractmanager.config.IsLinkedToUser;
import nl.rabobank.hackathon.sol.contractmanager.model.Contract;
import nl.rabobank.hackathon.sol.contractmanager.service.ContractService;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/contract")
public class ContractController {

    private final ContractService contractService;

    @GetMapping(path = "/${contractId}", produces = "application/json")
    public Contract getContractDetails(@PathVariable @IsLinkedToUser final String contractId) {
        return contractService.getContractDetails(contractId);
    }

}
