package ua.ypon.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.ypon.Project2Boot.models.Person;

/**
 * net.ukr@caravell 01/05/2023s
 */
@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}

