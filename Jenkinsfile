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
                sh 'mvn compile'
                    
                }
                
            }
        stage('clean'){
                steps{
                sh 'mvn package'
                    
                }
                
            }  
        stage('MVN TEST') {
                steps {
                sh 'mvn test'
                    
                }
                
            }  
        
                    
}

}
