pipeline {

	agent any
	
	stages {
	
		stage ('Build') {
			steps {
				withMaven(maven : 'maven_3_6_0'){
					sh 'export PATH=$MAVEN_HOME\bin && mvn clean package'
				}
			}
			
		}
		
		stage ('Deploy') {
			steps {
			withCredentials([[$class		   : 'UsernamePasswordMultiBinding',
							  credentialsId	   : 'PCF_LOGIN',
							  usernameVariable : 'USERNAME',
							  passwordVariable : 'PASSWORD']]){
					sh 'cf login -a api.run.pivotal.io -u $USERNAME -p $PASSWORD'
					sh 'cf push'
				}
			}
			
		}
	}

}