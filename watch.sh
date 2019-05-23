#!/usr/bin/env bash

./gradlew clean build
./gradlew buildDependencies
./gradlew -t jar
