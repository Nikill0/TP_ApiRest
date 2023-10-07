package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Base;
import com.facu.restfake.RestfakeApplication.entities.Persona;
import com.facu.restfake.RestfakeApplication.respositories.BaseRepository;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }


    @Override
    public List<E> findAll() throws Exception {
        return null;
    }

    @Override
    public E findById(ID aLong) throws Exception {
        return null;
    }

    @Override
    public E save(E entity) throws Exception {
        return null;
    }

    @Override
    public E update(ID aLong, E entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(ID aLong) throws Exception {
        return false;
    }
}
