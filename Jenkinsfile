pipeline {
  agent { 
    docker { 
      image 'mcr.microsoft.com/playwright/java:v1.35.0-jammy' 
    } 
  }
  stages {
    stage("clone tests")
      {
        steps {
        sh "cd /opt"
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
