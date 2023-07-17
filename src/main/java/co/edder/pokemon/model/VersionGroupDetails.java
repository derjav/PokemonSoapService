package co.edder.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VersionGroupDetails {

  @JsonProperty("level_learned_at")
  private int levelLearnedAt;
  @JsonProperty("move_learn_method")
  private Result moveLearnedMethod;
  @JsonProperty("version_group")
  private Result versionGroup;
}
