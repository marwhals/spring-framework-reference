package spring6reactive.mappers;

import spring6reactive.domain.Customer;
import spring6reactive.model.CustomerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
