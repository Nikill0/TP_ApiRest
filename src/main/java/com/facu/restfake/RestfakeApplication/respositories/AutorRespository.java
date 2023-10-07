package com.facu.restfake.RestfakeApplication.respositories;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRespository extends BaseRepository <Autor, Long> {
}
