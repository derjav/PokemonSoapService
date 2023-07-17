package co.edder.pokemon.service;

import co.edder.pokemon.model.Ability;
import co.edder.pokemon.model.Pokemon;
import co.edder.pokemon.model.PokemonView;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface PokemonService {

  @WebMethod
  public PokemonView getAllPokemon();
  
  @WebMethod
  public PokemonView getPokemonPaginated(int offset, int limit);
  
  @WebMethod
  public Pokemon getPokemonById(int id);
  
  @WebMethod
  public Ability getAbilityById(int abilityId);
}
