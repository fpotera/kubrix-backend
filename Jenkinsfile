#!/usr/bin/env groovy

node {
  
  echo 'kubrix-platform build started...' 
  
  stage('Build') {
    withMaven() {
      sh "mvn clean deploy"
    }
  }
}
