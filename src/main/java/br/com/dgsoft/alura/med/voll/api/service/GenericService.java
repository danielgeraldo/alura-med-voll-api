package br.com.dgsoft.alura.med.voll.api.service;

public interface GenericService<T> {
    T save(T object);

    boolean deleteById(Long id);
}
