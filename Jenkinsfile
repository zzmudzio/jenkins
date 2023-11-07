pipeline {
  agent { 
    docker { 
      image 'mcr.microsoft.com/playwright/java:v1.35.0-jammy'
    } 
  }
  stages {
    stage("test")
      {
       steps {
        sh 'mvn --version'
       }
      }    
  }

}
