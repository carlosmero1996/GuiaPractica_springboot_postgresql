package com.guia.CarlosMero.GuiaPractica.service;

import com.guia.CarlosMero.GuiaPractica.modelo.Restaurante;
import com.guia.CarlosMero.GuiaPractica.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante,Long> implements GenericService<Restaurante,Long>{


    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public CrudRepository<Restaurante, Long> getDao(){return restauranteRepository;}
}
