// Fetch the latest changes from the remote repository
'git fetch'.execute()

// Check if the specific folder has changed
def changes = 'git diff --name-only HEAD HEAD~1'.execute()
println changes.text

def filePath = './lala.txt'
def fileContent = new File(filePath).text

println fileContent

// if (changes) {
//     echo "Changes detected in the folder."
//     // You can set a variable or take any action based on the changes
// } else {
//     echo "No changes detected in the folder."
//     // You can skip subsequent steps or handle accordingly
// }