package org.sid.dao;

import org.sid.entities.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("*")
public interface EleveRepository extends JpaRepository<Eleve,Long> {
}
