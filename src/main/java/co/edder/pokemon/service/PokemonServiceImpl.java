package co.edder.pokemon.service;

import co.edder.pokemon.facade.PokemonServiceFacade;
import co.edder.pokemon.model.Ability;
import co.edder.pokemon.model.Pokemon;
import co.edder.pokemon.model.PokemonView;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "co.edder.pokemon.service.PokemonService")
public class PokemonServiceImpl implements PokemonService {
  
  private PokemonServiceFacade facade;
  
  public PokemonServiceImpl() {
    facade = new PokemonServiceFacade();
  }

  @WebMethod
  public PokemonView getAllPokemon() {
    return facade.getAllPokemon();
  }
  
  @WebMethod
  public PokemonView getPokemonPaginated(int offset, int limit) {
    return facade.getPokemonPaginated(offset, limit);
  }
  
  @WebMethod
  public Pokemon getPokemonById(int pokemonId) {
    return facade.getPokemonById(pokemonId);
  }

  @Override
  public Ability getAbilityById(int abilityId) {
    return facade.getAbilityById(abilityId);
  }
}
