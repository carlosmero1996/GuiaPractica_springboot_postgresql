/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia.CarlosMero.GuiaPractica.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author carlos
 */
@Data
@Entity
@Table(name = "plato")
public class Plato {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_plato;
    
    private String nombreplato;
    private String descripcion;
    private double precio;
    
    
    
   @ManyToOne
    @JoinColumn(name = "id_carta", referencedColumnName = "id_carta")
    private Carta cart_id;
   
}
