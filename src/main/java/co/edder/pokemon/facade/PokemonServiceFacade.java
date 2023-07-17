package co.edder.pokemon.facade;

import co.edder.pokemon.model.Ability;
import co.edder.pokemon.model.Pokemon;
import co.edder.pokemon.model.PokemonView;
import co.edder.pokemon.rest.client.PokemonRestClient;

public class PokemonServiceFacade {
  
  private PokemonRestClient client;
  
  public PokemonServiceFacade() {
    client = PokemonRestClient.getInstance();
  }

  public PokemonView getAllPokemon() {
    return client.getAllPokemon();
  }
  
  public PokemonView getPokemonPaginated(int offset, int limit) {
    return client.getPokemonPaginated(offset, limit);
  }
  
  public Pokemon getPokemonById(int pokemonId) {
    return client.getPokemonById(pokemonId);
  }
  
  public Ability getAbilityById(int abilityId) {
    return client.getAbilityById(abilityId);
  }
}
