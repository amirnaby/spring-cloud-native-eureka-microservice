package org.j2os.model.repository;

import org.j2os.model.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select distinct o from person o left join fetch o.cars c where o.personId = :pid")
    Person findByPersonId(@Param("pid") Long pid);

}
