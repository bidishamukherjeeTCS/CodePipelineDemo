#!/usr/bin/env bash
java -jar /opt/hello/maven-simplest-3.6.2-fat.jar &
echo $! > /opt/hello/hello.pid