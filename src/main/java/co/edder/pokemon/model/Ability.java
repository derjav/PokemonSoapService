package co.edder.pokemon.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties
@Data
public class Ability {

  @JsonProperty("effect_changes")
  private List<Result> effectChanges;
  @JsonProperty("effect_entries")
  private List<Effect> effectEntries;
  @JsonProperty("flavor_text_entries")
  private List<FlavorText> flavorTextEntries;
  private Result generation;
  private int id;
  @JsonProperty("is_main_series")
  private boolean mainSeries;
  private String name;
  private List<NameWrapper> names;
  private List<PokemonWrapper> pokemon;
}
