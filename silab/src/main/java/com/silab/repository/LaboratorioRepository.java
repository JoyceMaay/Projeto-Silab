package com.silab.repository;

import org.springframework.data.repository.CrudRepository;

import com.silab.models.Laboratorio;

public interface LaboratorioRepository extends CrudRepository<Laboratorio, String> {

	Laboratorio findByCodigo(long codigo);
}
