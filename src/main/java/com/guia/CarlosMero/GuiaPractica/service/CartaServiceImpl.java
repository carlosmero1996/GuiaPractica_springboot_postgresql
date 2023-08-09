/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia.CarlosMero.GuiaPractica.service;

import com.guia.CarlosMero.GuiaPractica.modelo.Carta;
import com.guia.CarlosMero.GuiaPractica.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class CartaServiceImpl extends GenericServiceImpl<Carta,Long> implements GenericService<Carta,Long> {
    
    @Autowired
    CartaRepository cartaRepository;

    @Override
    public CrudRepository<Carta, Long> getDao(){return cartaRepository;}
}
