pipeline {
  agent any
  stages {
    stage('clean_install') {
      steps {
        echo 'clean install'
      }
    }

    stage('full_install') {
      parallel {
        stage('full_install') {
          steps {
            echo 'full install'
          }
        }

        stage('pg_probackup') {
          steps {
            echo 'pg_probackup'
          }
        }

      }
    }

    stage('end') {
      steps {
        echo 'end'
      }
    }

  }
}