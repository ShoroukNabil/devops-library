def call() {
    echo "Installing Angular packages..."
    sh 'npm install -g @angular/cli@16'
    sh 'npm install'
}
