def call(){
    echo 'Checking Java version...'
    sh 'java -version || echo "Java not found"'

    echo 'Checking Maven version...'
    sh 'mvn -v || echo "Maven not found"'
}