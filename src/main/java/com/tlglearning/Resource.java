package com.tlglearning;
// AutoCloseable is inheriting an abstract method, so we have to override and implement this method
public class Resource implements AutoCloseable {

  public Resource() {
    System.out.println("Resource constructor");
    // throw new RuntimeException();
  }

  @Override
  public void close() throws Exception {
    System.out.println("Resource.close()");
    throw new Exception();
  }

  public void process() {
    System.out.println("Resource.process()");
    // throw new RuntimeException();
  }

}
