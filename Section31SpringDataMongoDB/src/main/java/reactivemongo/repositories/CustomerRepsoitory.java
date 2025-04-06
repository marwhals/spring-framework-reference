package reactivemongo.repositories;

import reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CustomerRepsoitory extends ReactiveMongoRepository<Customer, String> {
}
