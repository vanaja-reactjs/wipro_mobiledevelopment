mkdir -p TestDir

cd TestDir || exit

for ((i = 1; i <= 10; i++)); do
    filename="File${i}.txt"
    echo "${filename}" > "${filename}"
done

# Print success message
echo "Created 10 files in directory 'TestDir'."