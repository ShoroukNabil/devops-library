def call() {
    echo "Installing Angular packages..."
    sh 'sudo apt update'
    sh 'sudo apt install -y nodejs'
    sh 'npm install -g @angular/cli'
    sh 'npm install'
}
