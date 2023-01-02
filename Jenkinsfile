pipeline {
    agent { 
        node {
            label 'windows-temp-j'
            }
      }
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                mvn package -B
                ls
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
            }
        }
    }
}
