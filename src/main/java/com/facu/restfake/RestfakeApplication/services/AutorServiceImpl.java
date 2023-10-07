package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import com.facu.restfake.RestfakeApplication.respositories.AutorRespository;
import com.facu.restfake.RestfakeApplication.respositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorSerivce{

    @Autowired
    private AutorRespository autorRespository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
