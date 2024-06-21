#!bin/bash
while true;  do
    read -p "enter a number(enter 0 to stop): " num
    if ! [[ "$num" =~ ^[0-9]+$ ]]; then
        echo "Invalid input please enetr a valid number"
        continue
    fi

num=$((num))
    if [ "$num" -eq 0 ]; then 
         echo "exiting the program"
         break
    fi
    if [ $((num % 2)) -eq 0 ]; then
        echo "$num is even"
    else
        echo "$num is odd"
    fi
done

