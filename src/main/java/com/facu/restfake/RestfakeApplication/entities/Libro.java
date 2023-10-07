package com.facu.restfake.RestfakeApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base {

    @Column(name = "titulo")
    public String titulo;
    @Column(name = "fecha")
    public int fecha;
    @Column(name = "genero")
    public String genero;
    @Column(name = "paginas")
    public int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
