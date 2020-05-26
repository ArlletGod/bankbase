package com.myex.bankbase.repos;

import com.myex.bankbase.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo  extends JpaRepository<Person, Long> {

}
