pipeline {
    agent none
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
             }
      }
        stage('Birth') {
            steps {
                echo 'Welcome to the world!'
            }
        }
        stage('Education') {
            steps {
                echo 'Learn, grow, and develop new skills.'
            }
        }
        stage('Career') {
            steps {
                echo 'Find your passion and pursue a fulfilling career.'
            }
        }
        stage('Retirement') {
            steps {
                echo 'Relax, enjoy the fruits of your labor, and reflect on a life well-lived.'
            }
        }
    }
}