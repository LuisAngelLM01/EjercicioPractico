package com.lopezmorales.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopezmorales.app.api.model.HuCatMoneda;
import com.lopezmorales.app.api.model.HuCatMonedaId;

public interface HuCatMonedaRepository extends JpaRepository<HuCatMoneda, HuCatMonedaId>{

}
