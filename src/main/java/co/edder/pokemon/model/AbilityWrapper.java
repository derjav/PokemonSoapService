package co.edder.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AbilityWrapper {

  private Result ability;
  @JsonProperty("is_hidden")
  private boolean hidden;
  private int slot;
}
