#!/usr/bin/env groovy

node {
  maven 'M3'
  
  echo 'kubrix-platform build started...' 

  def mvn_version = 'M3'
  withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
    sh "mvn clean deploy"
  }
  
  stage('Build') {
    sh "mvn clean deploy"
  }
}
