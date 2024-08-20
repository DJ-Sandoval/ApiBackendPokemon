package com.aplicacion.pokemon;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aplicacion.pokemon.Entiti.Pokemon;
import com.aplicacion.pokemon.repositories.PokemonRepositories;

@SpringBootTest
class PomemonApiApplicationTests {

	@Test
	void contextLoads() {
	}

	 @Autowired
    private PokemonRepositories pokemonRepository;

	@Test
    public void guardarPokemon() {
		Pokemon pokemon = Pokemon.builder()
			.nombre("Bulbasaur")
			.tipo("planta")
			.ataque(118)
			.defensa(111)
			.build();
        pokemonRepository.save(pokemon);
    }

	@Test
    public void getAllPokemons() {
		List<Pokemon> pokemonList = pokemonRepository.getAllPokemons();
		pokemonList.forEach(pokemon -> System.out.println(pokemon));
    }

}
