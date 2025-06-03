pipeline{
    agent any


    stages{
        stage('Clone')
        {
          steps  {
                echo 'Cloning the Repo'
                git branch: 'main', url: 'https://github.com/Erik-rosol/CICD_training.git'
            }
          }
        stage('Build')
        {
                steps {

                    script{
                        setGitHunPullRequestStatus context: 'Build', state: "PENDING"
                        echo 'Building the project...'
                        sh 'mvn clean package -DskipTests=true'
                        setGitHunPullRequestStatus context: 'Build', state: "SUCCESS"
                        }
                   }
                }
        stage('Test')
        {
            steps{
                script{
                    setGitHunPullRequestStatus context: 'Build', state: "PENDING"
                    echo 'Running test'
                    sh 'mvn test -e'
                    setGitHunPullRequestStatus context: 'Build', state: "SUCCESS"
                }
            }
        }
    }
post{
    failure{
        setGitHunPullRequestStatus context: 'Test', state: 'FAILURE'
        }
    success{
        setGitHunPullRequestStatus context: 'Test', state: 'SUCCESS'
        }
    }
}
