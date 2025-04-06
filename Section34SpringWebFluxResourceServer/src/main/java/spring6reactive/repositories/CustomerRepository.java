package spring6reactive.repositories;

import spring6reactive.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
}
