pipeline {
  agent { 
    docker { 
      image 'mcr.microsoft.com/playwright/java:v1.35.0-jammy' 
    } 
  }
  stages {
    stage("hello world message")
      {
       steps {
        echo 'hello, test stage' 
       }
      }
    stage("install git")
      {
       steps {
        sh 'sudo apt install -y git'
       }
      }
    stage("clone tests")
      {
        steps {
        sh "git clone 'https://github.com/zzmudzio/jenkins.git'"
        sh "cd jenkins"
        }
      }
    stage("run playwright tests")
    {
      steps {
      sh "mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/suites/secondTestNG.xml"
      }
    }
  }

}
