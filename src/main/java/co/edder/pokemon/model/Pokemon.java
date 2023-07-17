package co.edder.pokemon.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

  private List<AbilityWrapper> abilities;
  private int baseExperience;
  @JsonProperty("game_indices")
  private List<GameIndex> gameIndices;
  private int height;
  private int id;
  private boolean isDefault;
  private List<LocationArea> locationAreas;
  private List<Move> moves;
  private String name;
  private int order;
  private Result species;
  private List<Stat> stats;
  private List<Type> types;
  private int weight;
}
