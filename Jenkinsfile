pipeline {

	agent any
	
	stages {
	
		stage ('Build') {
			steps {
				def mvnHome = tool 'maven_3_6_0'
				withMaven(maven : 'maven_3_6_0'){
					sh "'${mvnHome}/bin/mvn' clean package"
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