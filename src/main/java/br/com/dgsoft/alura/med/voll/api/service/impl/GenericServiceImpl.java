package br.com.dgsoft.alura.med.voll.api.service.impl;

import br.com.dgsoft.alura.med.voll.api.service.GenericService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class GenericServiceImpl<T> implements GenericService<T> {

    @PersistenceContext
    private EntityManager entityManager;
    private SimpleJpaRepository<T, Long> jpaRepository;

    private Class<T> realType;

    public GenericServiceImpl() {
        this.jpaRepository = new SimpleJpaRepository<T, Long>(realType,  entityManager);
    }


    public T save(T object) {
        return this.jpaRepository.save(object);
    }

    public boolean deleteById(Long id) {
        T obj = this.jpaRepository.getReferenceById(id);
        try{
            if(obj!=null){
                this.jpaRepository.deleteById(id);
                return true;
            } else {
                throw new RuntimeException("Registro não localizado");
            }
        } catch (Exception e) {
            return false;
        }
    }
}
