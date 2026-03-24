package com.terceiroexe.pedidoss.repositories;

import com.terceiroexe.pedidoss.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
