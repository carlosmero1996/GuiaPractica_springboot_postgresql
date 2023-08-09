/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia.CarlosMero.GuiaPractica.service;

import com.guia.CarlosMero.GuiaPractica.modelo.Plato;
import com.guia.CarlosMero.GuiaPractica.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class PlatoServiceImlp extends GenericServiceImpl<Plato,Long> implements GenericService<Plato,Long> {
    
    @Autowired
    PlatoRepository platoRepository;

    @Override
    public CrudRepository<Plato, Long> getDao(){return platoRepository;}
    
}
