package com.customer.information.infrastructure.controllers;

import com.customer.information.domain.model.customer.Customer;
import com.customer.information.domain.usecase.CustomerUseCase;
import com.customer.information.domain.model.customer.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerInformationController {

    private final CustomerUseCase customerUseCase;

     @PostMapping("id")
     public ResponseEntity<Customer> customerInformationById(@RequestBody CustomerRequest customerRequest) {
         Customer c = new Customer();
         if (customerRequest.getIdType().equalsIgnoreCase("cedula de ciudadania")||customerRequest.getIdType().equalsIgnoreCase("pasaporte")) {
             try {
                 c = customerUseCase.getCustomerInformationById(customerRequest);
                 System.out.println(c.toString());
                 if (!c.getIdDocument().equals("")) {
                     return new ResponseEntity<Customer>(c, HttpStatus.OK);
                 }else
                     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
             } catch (Exception e) {
                 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
             }
         }else{
             return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
         }
     }

}
