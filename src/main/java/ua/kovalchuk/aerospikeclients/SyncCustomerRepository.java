package ua.kovalchuk.aerospikeclients;

import java.util.List;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface SyncCustomerRepository extends AerospikeRepository<Customer, String> {

    List<Customer> findByLastNameOrderByFirstNameAsc(String lastName);
}