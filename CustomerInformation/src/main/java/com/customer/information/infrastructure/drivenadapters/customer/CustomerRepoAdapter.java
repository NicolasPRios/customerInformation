package com.customer.information.infrastructure.drivenadapters.customer;

import com.customer.information.domain.model.customer.Customer;
import com.customer.information.domain.model.customer.CustomerRequest;
import com.customer.information.domain.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepoAdapter implements CustomerRepository {

    @Value("${adapter.idTypeC}")
    private String idTypeC;
    @Value("${adapter.idDocumentC}")
    private String idDocumentC;
    @Value("${adapter.firtsNameC}")
    private String firtsNameC;
    @Value("${adapter.secondNameC}")
    private String secondNameC;
    @Value("${adapter.surnameC}")
    private String surnameC;
    @Value("${adapter.secondSurnameC}")
    private String secondSurnameC;
    @Value("${adapter.phoneC}")
    private String phoneC;
    @Value("${adapter.cityOfResidenceC}")
    private String cityOfResidenceC;

    @Override
    public Customer getCustomerInformationById(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        if(customerRequest.getIdType().equalsIgnoreCase(idTypeC)&&customerRequest.getIdDocument().equals(idDocumentC)) {
            customer.setIdType(idTypeC);
            customer.setIdDocument(idDocumentC);
            customer.setFirtsName(firtsNameC);
            customer.setSecondName(secondNameC);
            customer.setSurname(surnameC);
            customer.setSecondSurname(secondSurnameC);
            customer.setPhone(phoneC);
            customer.setCityOfResidence(cityOfResidenceC);
        }else
            customer.setIdDocument("");
        return customer;
    }
}
