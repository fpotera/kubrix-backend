#!/usr/bin/env groovy

node {
  maven 'M3'
  
  echo 'kubrix-platform build started...' 

  stage('Build') {
    sh "mvn clean deploy"
  }
}
