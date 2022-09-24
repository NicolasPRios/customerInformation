package com.customer.information.domain.model.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Customer implements Serializable {

    private String idType;
    private String idDocument;
    private String firtsName;
    private String secondName;
    private String surname;
    private String secondSurname;
    private String phone;
    private String cityOfResidence;

}
