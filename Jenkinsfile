#!/usr/bin/env groovy
pipeline {
    agent any
    options {
      timestamps()
      timeout(time: 10, unit: 'MINUTES')
      buildDiscarder(logRotator(numToKeepStr: '10'))
      disableConcurrentBuilds()
    }
    stages {
        stage('Build Stage') {
            steps {
              sh './gradlew clean build -x test'
            }
        }
    }
}
