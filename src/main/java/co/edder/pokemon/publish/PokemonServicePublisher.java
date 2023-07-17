package co.edder.pokemon.publish;

import co.edder.pokemon.service.PokemonServiceImpl;
import jakarta.xml.ws.Endpoint;

public class PokemonServicePublisher {

  public static void main(String[] args) {
    Endpoint.publish("http://localhost:8080/pokemonService", new PokemonServiceImpl());
  }
}
