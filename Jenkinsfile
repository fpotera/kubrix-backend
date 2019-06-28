#!/usr/bin/env groovy

node { 
  echo 'kubrix-platform build started...' 

  stage('Build') {
    sh "mvn clean deploy"
  }
}
