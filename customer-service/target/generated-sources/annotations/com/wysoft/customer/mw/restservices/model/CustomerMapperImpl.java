package com.wysoft.customer.mw.restservices.model;

import com.wysoft.customer.mw.restservices.dao.entities.CustomerEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-20T05:09:53-0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Amazon.com Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerEntityToDTO(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setCustomerId( customerEntity.getCustomerId() );
        customerDTO.setFirstName( customerEntity.getFirstName() );
        customerDTO.setLastName( customerEntity.getLastName() );
        customerDTO.setCity( customerEntity.getCity() );
        customerDTO.setCountry( customerEntity.getCountry() );

        return customerDTO;
    }
}
