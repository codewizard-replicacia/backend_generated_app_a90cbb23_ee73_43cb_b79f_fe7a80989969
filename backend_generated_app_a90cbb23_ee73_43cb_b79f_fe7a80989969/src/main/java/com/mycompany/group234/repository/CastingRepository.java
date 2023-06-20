package com.mycompany.group234.repository;


import com.mycompany.group234.model.Casting;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CastingRepository extends SimpleJpaRepository<Casting, String> {
    private final EntityManager em;
    public CastingRepository(EntityManager em) {
        super(Casting.class, em);
        this.em = em;
    }
    @Override
    public List<Casting> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Casting\"", Casting.class).getResultList();
    }
}