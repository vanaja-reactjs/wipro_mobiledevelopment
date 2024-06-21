echo enter file name
read file
c=` cat $file | wc -c `
echo number of characters in $file is $c
w=` cat $file | wc -w`
echo number of characters in $file is $w
lines=` grep -c "." $file `
echo number of lines in $file is $lines