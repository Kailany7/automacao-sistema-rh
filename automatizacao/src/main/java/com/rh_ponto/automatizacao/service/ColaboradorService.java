package com.rh_ponto.automatizacao.Service;

import com.rh_ponto.automatizacao.model.Colaborador;
import com.rh_ponto.automatizacao.model.Setor;
import com.rh_ponto.automatizacao.model.Jornada;
import com.rh_ponto.automatizacao.repository.ColaboradorRepository;
import com.rh_ponto.automatizacao.repository.SetorRepository;
import com.rh_ponto.automatizacao.repository.JornadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {

    private final ColaboradorRepository colaboradorRepo;
    private final SetorRepository setorRepo;
    private final JornadaRepository jornadaRepo;

    public ColaboradorService(ColaboradorRepository colaboradorRepo,
                              SetorRepository setorRepo,
                              JornadaRepository jornadaRepo) {
        this.colaboradorRepo = colaboradorRepo;
        this.setorRepo = setorRepo;
        this.jornadaRepo = jornadaRepo;
    }

    public Colaborador salvar(Colaborador colaborador) {
        if (colaborador.getSetor() != null) {
            Integer setorId = colaborador.getSetor().getId_setor();
            Setor setor = setorRepo.findById(setorId)
                    .orElseThrow(() -> new RuntimeException("Setor não encontrado"));
            colaborador.setSetor(setor);
        }
        if (colaborador.getJornada() != null) {
            Integer jornadaId = colaborador.getJornada().getId_jornada();
            Jornada jornada = jornadaRepo.findById(jornadaId)
                    .orElseThrow(() -> new RuntimeException("Jornada não encontrada"));
            colaborador.setJornada(jornada);
        }
        return colaboradorRepo.save(colaborador);
    }

    public List<Colaborador> listar() {
        return colaboradorRepo.findAll();
    }

    public Colaborador buscarPorId(Integer id) {
        return colaboradorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
    }

    public Colaborador atualizar(Integer id, Colaborador colaborador) {
        Colaborador c = buscarPorId(id);
        c.setNome_colaborador(colaborador.getNome_colaborador());
        c.setCpf(colaborador.getCpf());
        c.setStatus(colaborador.getStatus());

        if (colaborador.getSetor() != null) {
            Integer setorId = colaborador.getSetor().getId_setor();
            Setor setor = setorRepo.findById(setorId)
                    .orElseThrow(() -> new RuntimeException("Setor não encontrado"));
            c.setSetor(setor);
        }

        if (colaborador.getJornada() != null) {
            Integer jornadaId = colaborador.getJornada().getId_jornada();
            Jornada jornada = jornadaRepo.findById(jornadaId)
                    .orElseThrow(() -> new RuntimeException("Jornada não encontrada"));
            c.setJornada(jornada);
        }

        return colaboradorRepo.save(c);
    }

    public void deletar(Integer id) {
        Colaborador c = buscarPorId(id);
        colaboradorRepo.delete(c);
    }
}
