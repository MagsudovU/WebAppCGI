/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'openjdk:latest' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
