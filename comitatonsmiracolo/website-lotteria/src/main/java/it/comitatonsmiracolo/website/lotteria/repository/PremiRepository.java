package it.comitatonsmiracolo.website.lotteria.repository;

import it.comitatonsmiracolo.website.lotteria.entity.Premio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiRepository extends CrudRepository<Premio, Integer> {
}
