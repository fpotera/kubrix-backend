#!/usr/bin/env groovy

node {
  tool 'M3'
  echo 'kubrix-platform build started...' 
  
  stage('Build') {
    git url: "https://github.com/fpotera/kubrix-platform.git"
    
    withMaven(maven: 'M3') {
      sh "ls"
      sh "mvn clean deploy"
    }
  }
}
