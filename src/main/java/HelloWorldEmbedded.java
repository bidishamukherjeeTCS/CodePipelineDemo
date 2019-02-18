package io.vertx.example;

import io.vertx.core.Vertx;


/**
 * @author <a href=\"http://tfox.org\">Tim Fox</a>
 */
public class HelloWorldEmbedded {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("<!doctype html> " +
"<html lang=\"en\">" +
"<head>" +
  "<meta charset=\"utf-8\">" +
  "<title>HealthCare Consumer Portal</title>" +
  "<base href=\"/client/\">" +
  "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> " +
  "<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.png\"> " +
  "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\"> " +
  "<meta name=\"theme-color\" content=\"#f27b00\">" +
  "<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">" +
  "<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">" +
  "<meta name=\"apple-mobile-web-app-title\" content=\"Portea One\">" +
  "<link rel=\"apple-touch-icon\" href=\"assets/icons/new-icon-192x192.png\">" +
  "<link rel=\"manifest\" href=\"manifest.json\">" +
  "<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-48252366-2\"></script>" +
  "<script src=\"https://checkout.razorpay.com/v1/checkout.js\"></script>" +
"<link rel=\"stylesheet\" href=\"styles.366ceb7189346f9af6f3.css\"></head>" +
"<body>" +
  "<noscript>" +
  "  You need javascript to use this application" +
  "</noscript>" +
  "<app-root></app-root>" +
  "<script>" +
  "  window.dataLayer = window.dataLayer || [];" +
   " function gtag(){dataLayer.push(arguments);}" +
   " gtag('js', new Date());" +
   " gtag('config', 'UA-48252366-2');" +
  "</script>" +
"<script type=\"text/javascript\" src=\"runtime.cf99c7b9e5f7f9b19078.js\"></script><script type=\"text/javascript\" src=\"polyfills.3970a6cd97d0df1605e3.js\"></script><script type=\"text/javascript\" src=\"scripts.4ce424778a601e418dd2.js\"></script><script type=\"text/javascript\" src=\"main.eb6357f3c92098e36f25.js\"></script></body>" +
"</html>")).listen(8080);
  }
}