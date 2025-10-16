stage('building the package'){
    steps{
            sh "mvn clean package"
    }
}