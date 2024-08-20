package com.aplicacion.pokemon.service;

import java.util.List;

import com.aplicacion.pokemon.Entiti.Pokemon;

public interface PokemonService {

    List<Pokemon> finAllPokemons();
    Pokemon finPokemonById(Long pokemonId);
    Pokemon savePokemon(Pokemon pokemon);
    Pokemon updatePokemon(Long pokemonId, Pokemon pokemon);
    void deletePokemon(Long pokemonId);
}
