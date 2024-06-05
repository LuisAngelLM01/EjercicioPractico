package com.lopezmorales.app.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lopezmorales.app.api.model.HuCatMoneda;
import com.lopezmorales.app.api.model.HuCatMonedaId;
import com.lopezmorales.app.api.repository.HuCatMonedaRepository;

@Service
public class HuCatMonedaService {
	@Autowired
    private HuCatMonedaRepository repository;

    public List<HuCatMoneda> getAllMonedas() {
        return repository.findAll();
    }

    public Optional<HuCatMoneda> getMonedaById(Long numCia, String claveMoneda) {
        return repository.findById(new HuCatMonedaId(numCia, claveMoneda));
    }

    public HuCatMoneda createMoneda(HuCatMoneda moneda) {
        return repository.save(moneda);
    }

    public Optional<HuCatMoneda> updateMoneda(Long numCia, String claveMoneda, HuCatMoneda moneda) {
        if (repository.existsById(new HuCatMonedaId(numCia, claveMoneda))) {
            moneda.setNumCia(numCia);
            moneda.setClaveMoneda(claveMoneda);
            return Optional.of(repository.save(moneda));
        } else {
            return Optional.empty();
        }
    }

    public void deleteMoneda(Long numCia, String claveMoneda) {
        repository.deleteById(new HuCatMonedaId(numCia, claveMoneda));
    }
}
