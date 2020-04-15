
pipeline {

    agent any

    triggers { pollSCM('* * * * *') }


    stages {

        stage('Stage-Two') {
            steps {
                print "Running "
            }
        }

    }
}