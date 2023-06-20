package com.mycompany.group234.repository;


import com.mycompany.group234.model.CreatingBudget;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CreatingBudgetRepository extends SimpleJpaRepository<CreatingBudget, String> {
    private final EntityManager em;
    public CreatingBudgetRepository(EntityManager em) {
        super(CreatingBudget.class, em);
        this.em = em;
    }
    @Override
    public List<CreatingBudget> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"CreatingBudget\"", CreatingBudget.class).getResultList();
    }
}