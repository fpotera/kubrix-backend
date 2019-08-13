#!/usr/bin/env groovy

node {
  tool 'M3'
  echo 'kubrix-platform build started...' 
  
  stage('Build') {
    git url: "https://github.com/fpotera/kubrix-platform.git"
    
    withMaven(maven: 'M3') {
      withCredentials([string(credentialsId: 'github-token', variable: 'GITHUB_TOKEN')]) {
        sh "mvn -Dgithub.global.oauth2Token=$GITHUB_TOKEN clean deploy"
      }
    }
  }
}
