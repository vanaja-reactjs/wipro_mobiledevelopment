DEBUG=true # Set to true to enable debug mode

# Function to print debug messages
debug() {
    if [ "$DEBUG" = true ]; then
        echo "[DEBUG] $Testdir1"
    fi
}

# Function to create the directory if it doesn't exist
create_directory() {
    if [ -d "$Testdir1" ]; then
        debug "Directory '$Testdir1' already exists."
    else
        debug "Creating directory '$Testdir1'."
        mkdir -p "$Testdir1"
        if [ $? -ne 0 ]; then
            echo "Error: Failed to create directory '$Testdir1'."
            exit 1
        fi
    fi
}

# Function to create files with filenames as content
create_files() {
    debug "Creating files inside directory '$Testdir1'."
    cd "$Testdir1" || {
        echo "Error: Directory '$Testdir1' not found or inaccessible."
        exit 1
    }

    for ((i = 1; i <= 10; i++)); do
        filename="File${i}.txt"
        debug "Creating file '$filename'."
        echo "${filename}" > "${filename}"
        if [ $? -ne 0 ]; then
            echo "Error: Failed to create file '$filename' in directory '$1'."
            exit 1
        fi
    done

    debug "Files creation complete."
}

# Main script starts here
if [ "$#" -ne 1 ]; then
    echo "Usage: $Testdir1 <directory>"
    exit 1
fi

directory_name="$1"
create_directory "$directory_name"
create_files "$directory_name"

echo "Created 10 files in directory '$directory_name'."