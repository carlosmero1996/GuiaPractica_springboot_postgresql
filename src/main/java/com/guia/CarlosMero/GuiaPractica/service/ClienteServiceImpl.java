/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia.CarlosMero.GuiaPractica.service;

import com.guia.CarlosMero.GuiaPractica.modelo.Cliente;
import com.guia.CarlosMero.GuiaPractica.repository.Clienterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente,Long> implements GenericService<Cliente,Long> {
    
    @Autowired
    Clienterepository clienteRepository;

    @Override
    public CrudRepository<Cliente, Long> getDao(){return clienteRepository;}
}
