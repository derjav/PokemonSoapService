package co.edder.pokemon.model;

public class PokemonView {

  private int count;
  private String next;
  private String previous;
  private Result[] results;
  
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }
  public Result[] getResults() {
    return results;
  }
  public void setResults(Result[] results) {
    this.results = results;
  }
  
  
}
