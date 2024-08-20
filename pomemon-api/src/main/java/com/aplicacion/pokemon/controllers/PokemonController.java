package com.aplicacion.pokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacion.pokemon.Entiti.Pokemon;
import com.aplicacion.pokemon.service.PokemonService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    
    @Autowired
    private PokemonService pokemonService;
    
    // Primer endPoint
    @GetMapping("/getAllPokemons")
    public List<Pokemon> getAllPokemons() {
        return pokemonService.finAllPokemons();
    }

    // Segundo endPoint
    @GetMapping("/getPokemon/{pokemonId}")
    public Pokemon getPokemon(@PathVariable Long pokemonId) {
        return pokemonService.finPokemonById(pokemonId);
    }

    // Tercer endPoint
    @PostMapping("/savePokemon")
    public Pokemon savePokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.savePokemon(pokemon);
    }

    // Cuarto endPoint
    @PutMapping("/updatePokemon/{pokemonId}")
    public Pokemon updatePokemon(@PathVariable Long pokemonId, @RequestBody Pokemon pokemon) {
        return pokemonService.updatePokemon(pokemonId, pokemon);
    }

    // Quinto endPoint
    @DeleteMapping("/deletePokemon/{pokemonId}")
    public String deletPokemon(@PathVariable Long pokemonId) {
        pokemonService.deletePokemon(pokemonId);
        return "Pokemon eliminado correctamente!";
    }
}
