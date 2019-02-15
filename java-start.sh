#!/usr/bin/env bash
java -jar maven-simplest-3.6.2-fat.jar &
echo $! > hello.pid