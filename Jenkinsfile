@Library('devops-library') _  // Load the shared library

pipeline {
    agent any

    stages {    
        stage('Hello') {
            steps {
                script {
                    hello()  // Calls vars/hello.groovy
                }
            }
        }
    }
}
