def call(int buildNumber) {
    if(buildNumber % 2 == 0){
        stage('even'){
            steps{
                echo 'is even'
            }
        }
    }
    else{
        stage('odd'){
            steps{
                echo 'is odd'
            }
        }
    }
}
