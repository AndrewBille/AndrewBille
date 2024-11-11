pipeline {
    stages {

        stage("clean install") {
            steps {
                echo "I'm clean install"
                sh "python3 test.py"
            }
        }

        stage("big tests") {
            parallel {
                stage("full install") {
                    steps {
                        echo "I'm full install"
                        sh "python3 test.py"
                    }
                }
                stage("test pg_probackup") {
                    steps {
                        echo "I'm pg_probackup"
                        sh "python3 test.py"
                    }
                }
            }
        }
    }
    post {
        always {
            echo "I'm post"
        }
    }
}
