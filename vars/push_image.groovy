def call(String Project , String Imagetag , String dockerhubuser)
{
  echo "pushing image to docker hub"
                withCredentials([usernamePassword(
                    credentialsId:"docker-hub-cred",
                    usernameVariable:"dockerHubUser", 
                    passwordVariable:"dockerHubPass")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker image tag notes-app:latest ${dockerHubUser}/${Project}:${Imagetag}"
                sh "docker push ${dockerHubUser}/${Project}:${Imagetag}"
                }
}
