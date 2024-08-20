package com.aplicacion.pokemon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.pokemon.Entiti.Pokemon;
import com.aplicacion.pokemon.repositories.PokemonRepositories;

@Service
public class PokemonServiceImplements implements PokemonService {

    @Autowired
    private PokemonRepositories pokemonRepository;


    @Override
    public List<Pokemon> finAllPokemons() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon finPokemonById(Long pokemonId) {
        Optional<Pokemon> pokemonOptional = pokemonRepository.findById(pokemonId);
        return pokemonOptional.orElseThrow();
    }

    @Override
    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Pokemon updatePokemon(Long pokemonId, Pokemon pokemon) {
        Optional<Pokemon> pokemonOptional = pokemonRepository.findById(pokemonId);
        Pokemon pokemonBD = pokemonOptional.orElseThrow();
        pokemonBD.setNombre(pokemon.getNombre());
        pokemonBD.setTipo(pokemon.getTipo());
        pokemonBD.setAtaque(pokemon.getAtaque());
        pokemonBD.setDefensa(pokemon.getDefensa());
        return pokemonRepository.save(pokemonBD);

    }

    @Override
    public void deletePokemon(Long pokemonId) {
        pokemonRepository.deleteById(pokemonId);
    }

}
 