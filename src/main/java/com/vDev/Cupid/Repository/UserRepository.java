package com.vDev.Cupid.Repository;

import com.vDev.Cupid.Model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan //need to enable some repository methods that are by default blocked by dynamoDB.
public interface UserRepository extends CrudRepository<User, String> {
//    @EnableScan
//    Iterable<User> findAll();
}
