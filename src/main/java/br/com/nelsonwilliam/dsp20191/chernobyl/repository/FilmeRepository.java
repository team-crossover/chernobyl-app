package br.com.nelsonwilliam.dsp20191.chernobyl.repository;

import br.com.nelsonwilliam.dsp20191.chernobyl.domain.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    void deleteById(Long id);
}
