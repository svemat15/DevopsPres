pipeline {
    agent any

    tools{
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }

    stages {
        stage('Bulid') {
            steps {
                sh 'mvn install'
            }
        }
    stages {
        stage('test') {
            steps {
                echo 'Testing'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}