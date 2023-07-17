package co.edder.pokemon.rest.client;

import co.edder.pokemon.model.Ability;
import co.edder.pokemon.model.Pokemon;
import co.edder.pokemon.model.PokemonView;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

public class PokemonRestClient {
  
  private static PokemonRestClient restClient;
  
  private PokemonRestClient() {
    super();
    client = ClientBuilder.newClient();
  }

  private Client client;

  private static final String POKEMON_REST_ENDPOINT = "https://pokeapi.co/api/v2/pokemon";
  private static final String ABILITY_REST_ENDPOINT = "https://pokeapi.co/api/v2/ability";

  public static PokemonRestClient getInstance() {
    if (restClient == null) {
      restClient = new PokemonRestClient();
    }
    return restClient;
  }

  public PokemonView getAllPokemon() {
    return client.target(POKEMON_REST_ENDPOINT).path("/").request(MediaType.APPLICATION_JSON)
        .get(PokemonView.class);
  }

  public PokemonView getPokemonPaginated(int offset, int limit) {
    return client.target(POKEMON_REST_ENDPOINT).path("/").queryParam("offset", offset)
        .queryParam("limit", limit).request(MediaType.APPLICATION_JSON).get(PokemonView.class);

  }

  public Pokemon getPokemonById(int pokemonId) {

    return client.target(POKEMON_REST_ENDPOINT).path("/" + pokemonId)
        .request(MediaType.APPLICATION_JSON).get(Pokemon.class);
  }

  public Ability getAbilityById(int abilityId) {
    return client.target(ABILITY_REST_ENDPOINT).path("/" + abilityId)
        .request(MediaType.APPLICATION_JSON).get(Ability.class);
  }
}
