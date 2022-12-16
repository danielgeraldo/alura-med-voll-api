package br.com.dgsoft.alura.med.voll.api.repository;

import br.com.dgsoft.alura.med.voll.api.model.data.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
