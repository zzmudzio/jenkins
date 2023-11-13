pipeline {
    agent {
        docker {
            image 'mcr.microsoft.com/playwright/java:v1.39.0-jammy'
            args '-u root --security-opt seccomp=unconfined'
        }
    }
    environment {
        JAVA_HOME = "/usr/lib/jvm/java-17-openjdk-amd64"
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Run Playwright regression tests') {
            steps {
                sh 'xvfb-run mvn clean test'
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            cleanWs()
        }
        success {
            echo 'I succeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
        }
    }

}