def call() {
    echo "Running Maven clean install..."
    sh 'mvn clean install -DskipTests'
}
