package co.edder.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Effect {

  private String effect;
  private Result language;
  @JsonProperty("short_effect")
  private String shortEffect;
}
