package co.edder.pokemon.rest.client;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import co.edder.pokemon.model.Ability;
import co.edder.pokemon.model.Pokemon;
import co.edder.pokemon.model.PokemonView;

class PokemonRestClientTest {
  
  private PokemonRestClient client;

  @BeforeEach
  void setUp() throws Exception {
    client = PokemonRestClient.getInstance();
  }

  @Test
  void testGetAllPokemon() {
    PokemonView view = client.getAllPokemon();
    assertEquals(1281, view.getCount());
  }
  
  @Test
  void testGetPokemonPaginated() {
    PokemonView view = client.getPokemonPaginated(0, 20);
    assertEquals(20, view.getResults().length);
  }
  
  @Test
  void testGetPokemonById(){
    Pokemon pokemon = client.getPokemonById(1);
    assertEquals("bulbasaur", pokemon.getName());
  }
  
  @Test
  void testGetAbilityById() {
    Ability ability = client.getAbilityById(67);
    assertEquals("torrent", ability.getName());
  }

}
