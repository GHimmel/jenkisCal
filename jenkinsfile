pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/GHimmel/jenkisCal.git']]])
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        
    }

    post {
        success {
            echo 'El proceso de Jenkins se ejecutó con éxito'
            // Puedes agregar más pasos aquí en caso de éxito
        }
        failure {
            echo 'El proceso de Jenkins falló'
            // Puedes agregar más pasos aquí en caso de fallo
        }
    }
}
