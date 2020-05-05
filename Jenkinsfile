pipeline {
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        sh 'mvn clean'
        echo "clean"
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
        echo "compile"
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
        echo "test"
      }
    }
  }
}
