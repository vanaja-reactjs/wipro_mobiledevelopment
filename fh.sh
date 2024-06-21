#!/bin/bash
read -p "enter file name:" filename
while read line
do 
echo $line
done <$filename