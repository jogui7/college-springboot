package pucpr.br.exemplo.veiculo.service;

import pucpr.br.exemplo.veiculo.entity.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class VeiculoService {

    Logger log = Logger.getLogger(VeiculoService.class.getName());

    public Veiculo salvar(Veiculo veiculo) {
        log.info(veiculo.getPlaca());
        log.info(veiculo.getModelo());

        return null;
    }

    public List<Veiculo> listar() {
        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo v = new Veiculo();

        v.setPlaca("AXG9870");
        v.setModelo("318");

        veiculos.add(v);
        return veiculos;
    }

    public void excluir(Veiculo veiculo) {

    }
}
