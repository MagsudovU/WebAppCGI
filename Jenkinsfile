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
                cd WebAppCGI
                mvn install -r requirements.txt
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
