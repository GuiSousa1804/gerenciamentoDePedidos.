package com.terceiroexe.pedidoss;

import com.terceiroexe.pedidoss.models.PedidoModel;
import com.terceiroexe.pedidoss.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criarPedido(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> findAll() {
        return pedidoRepository.findAll();
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

    public PedidoModel findById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}
