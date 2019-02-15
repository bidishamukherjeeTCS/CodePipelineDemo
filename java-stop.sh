#!/usr/bin/env bash
if [ -f /opt/hello/hello.pid ]; then
    pkill -F /opt/hello/hello.pid
    rm -f /opt/hello/hello.pid
fi