package co.edder.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlavorText {

  @JsonProperty("flavor_text")
  private String flavorText;
  private Result language;
  @JsonProperty("version_group")
  private Result versionGroup;
}
