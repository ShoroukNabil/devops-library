def call() {
    echo "Installing Angular packages..."
    sh 'npm install -g @angular/cli'
    sh 'npm install'
}
