package com.mycompany.group234.repository;


import com.mycompany.group234.model.Crew;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CrewRepository extends SimpleJpaRepository<Crew, String> {
    private final EntityManager em;
    public CrewRepository(EntityManager em) {
        super(Crew.class, em);
        this.em = em;
    }
    @Override
    public List<Crew> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Crew\"", Crew.class).getResultList();
    }
}