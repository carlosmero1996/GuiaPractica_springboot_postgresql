/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia.CarlosMero.GuiaPractica.repository;

import com.guia.CarlosMero.GuiaPractica.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlos
 */
public interface Clienterepository extends JpaRepository<Cliente, Long>{
    
}
