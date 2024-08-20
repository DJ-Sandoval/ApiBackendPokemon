package com.aplicacion.pokemon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aplicacion.pokemon.Entiti.Pokemon;
import java.util.List;


@Repository
public interface PokemonRepositories extends JpaRepository<Pokemon, Long> {
    @Query( "SELECT P FROM Pokemon P" )
    List<Pokemon> getAllPokemons();
}
