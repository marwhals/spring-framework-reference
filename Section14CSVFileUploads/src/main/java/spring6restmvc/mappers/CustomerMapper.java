package spring6restmvc.mappers;


import org.mapstruct.Mapper;
import spring6restmvc.entities.Customer;
import spring6restmvc.model.CustomerDTO;


@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
