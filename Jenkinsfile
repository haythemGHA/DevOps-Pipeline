pipeline {
    agent any

    stages{
        stage("git pull"){
            steps{
              
                git branch: 'Produit',  
                url: 'https://github.com/haythemGHA/DevOps-Pipeline.git'
                    
                }
                
            }
            
        stage('MVN COMPILE') {
                steps {
                sh 'mvn clean compile'
                    
                }
                
            }
        stage('clean'){
                steps{
                sh 'mvn clean package'
                    
                }
                
            }  
        stage('MVN TEST') {
                steps {
                sh 'mvn clean test'
                    
                }
                
            }  
        stage('build'){
            steps{
                sh 'mvn install package'
            }
         }
                    
}

}
