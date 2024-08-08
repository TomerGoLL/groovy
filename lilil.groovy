// Fetch the latest changes from the remote repository
sh(script: 'git fetch')

// Check if the specific folder has changed
def changes = sh(script: 'git diff --name-only HEAD HEAD~1 -- ./test', returnStdout: true).trim()

if (changes) {
    echo "Changes detected in the folder."
    // You can set a variable or take any action based on the changes
} else {
    echo "No changes detected in the folder."
    // You can skip subsequent steps or handle accordingly
}