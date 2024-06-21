#!/bin/bash
echo eneter file name 
read file
if [ -e "$file" ]; then
    echo file exists
else
    echo file not exist
fi