@Library('devops-library') _  // Load the shared library

pipeline {
    agent any

    parameters {
        string(name: 'BRANCH_NAME', defaultValue: 'main', description: 'Git branch to checkout')
    }

    stages {
          stage('Hello') {
            steps {
                script {
                    hello()  // Calls vars/hello.groovy
                }
            }
        }

        stage('Checkout Code') {
            steps {
                script {
                    checkout([
                        $class: 'GitSCM',
                        branches: [[name: "*/${params.BRANCH_NAME}"]],
                        userRemoteConfigs: [[
                            url: 'https://github.com/ShoroukNabil/DevOps_MVN_Server.git'  
                        ]]
                    ])
                }
            }
        }

        stage('Install Backend') {
            steps {
                script {
                    mvnInstall()  // Calls vars/mvnInstall.groovy
                }
            }
        }
    }
}
