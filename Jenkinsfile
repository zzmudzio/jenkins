pipeline {
  agent { 
    docker { 
      image 'mcr.microsoft.com/playwright/java:v1.35.0-jammy'
    } 
  stages {
    stage("clone tests")
      {
       steps {
        sh 'mvn --version'
       }
  }
}
}
