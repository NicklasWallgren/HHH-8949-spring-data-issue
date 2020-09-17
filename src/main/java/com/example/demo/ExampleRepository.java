package com.example.demo;

import java.util.Optional;
import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

interface ExampleRepository extends JpaRepository<Example, Long> {

    @Override
    @QueryHints({@QueryHint(name = "javax.persistence.cache.retrieveMode", value = "BYPASS")})
    Optional<Example> findById(Long id);

}
