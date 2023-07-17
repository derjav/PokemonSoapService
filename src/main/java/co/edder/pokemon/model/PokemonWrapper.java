package co.edder.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PokemonWrapper {

  @JsonProperty("is_hidden")
  private boolean hidden;
  private Result pokemon;
  private int slot;
}
