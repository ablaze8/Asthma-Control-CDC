package edu.gatech.epidemics.dao;

import edu.gatech.epidemics.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author atalati
 */
@Repository
public interface LoginRepository extends JpaRepository<Person, Integer> {
    Person findUserByUsername(String username);
}
