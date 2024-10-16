package Facade;

import java.util.HashMap;

public class Cache {
  private HashMap<String, Row> cache = new HashMap<String, Row>();

  public void put(Row row) {
    cache.put(row.getName().toLowerCase(), row);
  }

  public Row get(String name) {
    return cache.get(name.toLowerCase());
  }
}
