def call(String url , String branch)
{
  echo "Code cloning from github"
  git url: "${url}" , branch:"${branch}"
  echo "Code cloning completed"
}
