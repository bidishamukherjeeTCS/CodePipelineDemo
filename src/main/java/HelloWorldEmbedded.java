package io.vertx.example;

import io.vertx.core.Vertx;


/**
 * @author <a href=\"http://tfox.org\">Tim Fox</a>
 */
public class HelloWorldEmbedded {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("<html><h1>This is a sample Java App deployed through AWS pipeline</h1> </html>")).listen(8080);
  }
}