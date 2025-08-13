package com.github.caiormt.dict;

import org.springframework.boot.SpringApplication;

public class TestDictApplication {

  public static void main(String[] args) {
    SpringApplication.from(DictApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
