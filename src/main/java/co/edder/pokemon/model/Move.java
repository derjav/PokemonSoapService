package co.edder.pokemon.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Move {

  private Result move;
  @JsonProperty("version_group_details")
  private List<VersionGroupDetails> versionGroupDetails;
}
