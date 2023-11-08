pipeline {
  agent { 
    docker { 
      image 'mcr.microsoft.com/playwright/java:v1.39.0-jammy'
           }
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
