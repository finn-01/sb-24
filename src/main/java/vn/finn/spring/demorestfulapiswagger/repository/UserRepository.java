package vn.finn.spring.demorestfulapiswagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.finn.spring.demorestfulapiswagger.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
