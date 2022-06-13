package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class GreetingService {

  public List<GreetingDto> greetingList = new ArrayList<>();

  public List<GreetingDto> register(String name) {
    GreetingDto dto = new GreetingDto(name);
    greetingList.add(dto);
    return greetingList;
  }
}
