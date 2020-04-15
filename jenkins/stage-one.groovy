
pipeline {

    agent any

    triggers { pollSCM('* * * * *') }


    stages {

        stage('Stage-One') {
            steps {
                print "Running "
            }
        }

    }
}