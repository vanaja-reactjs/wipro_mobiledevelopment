#!/bin/bash
my_function()
{
    echo enter filename
    read filename
    if [ -f "$filename" ]; then
        num_lines=$(wc -l < "$filename")
        echo "The file '$filename' has $num_lines lines."
    else
        echo "Error: The file '$filename' does not exist."
    fi
}

my_function 
