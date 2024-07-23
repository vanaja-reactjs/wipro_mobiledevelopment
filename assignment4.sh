mkdir -p TestDir

# Change into the directory TestDir
cd TestDir || exit

# Create 10 files with filenames File1.txt to File10.txt
for ((i = 1; i <= 10; i++)); do
    filename="File${i}.txt"
    echo "${filename}" > "${filename}"
done

# Print success message
echo "Created 10 files in directory 'TestDir'."