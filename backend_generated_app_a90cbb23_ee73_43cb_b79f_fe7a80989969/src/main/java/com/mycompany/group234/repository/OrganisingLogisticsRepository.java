package com.mycompany.group234.repository;


import com.mycompany.group234.model.OrganisingLogistics;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrganisingLogisticsRepository extends SimpleJpaRepository<OrganisingLogistics, String> {
    private final EntityManager em;
    public OrganisingLogisticsRepository(EntityManager em) {
        super(OrganisingLogistics.class, em);
        this.em = em;
    }
    @Override
    public List<OrganisingLogistics> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"OrganisingLogistics\"", OrganisingLogistics.class).getResultList();
    }
}