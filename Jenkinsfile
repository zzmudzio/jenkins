pipeline {
  agent any
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
