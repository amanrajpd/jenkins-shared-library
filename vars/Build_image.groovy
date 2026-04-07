def call(String name , String tag)
{
      echo "Code building with docker"
      sh "docker build -t ${name}:${tag} ."
      echo "docker image created"
}
