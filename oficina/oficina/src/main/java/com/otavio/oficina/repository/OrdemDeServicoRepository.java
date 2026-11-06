package com.otavio.oficina.repository;

import com.otavio.oficina.model.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long> {
    // Pronto! O Spring já te dá de graça os métodos:
    // .save(os), .findAll(), .findById(id), .deleteById(id)
}