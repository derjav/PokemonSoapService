package co.edder.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Stat {

  @JsonProperty("base_stat")
  private int baseStat;
  private int effort;
  private Result stat;
}
