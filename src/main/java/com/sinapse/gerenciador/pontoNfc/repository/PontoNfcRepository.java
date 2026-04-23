package com.sinapse.gerenciador.pontoNfc.repository;

import com.sinapse.gerenciador.pontoNfc.model.PontoNfc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PontoNfcRepository extends JpaRepository<PontoNfc, Long> {
    Optional<PontoNfc> findByCodigoNfc(String codigoNfc);
}
