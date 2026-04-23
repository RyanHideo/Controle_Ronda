package com.sinapse.gerenciador.leitura.repository;

import com.sinapse.gerenciador.leitura.model.Leituras;
import com.sinapse.gerenciador.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LeituraRepository extends JpaRepository<Leituras, Long> {
    List<Leituras> findByUsuarioId(Long usuarioId);
}