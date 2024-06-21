#!bin/bash
time=$(date +%H)
echo "time: $time"
if [ $time -lt 12 ]; then
      echo "good morning users"
elif [$time -lt 18]; then
    echo "good afternoon user"
else
    echo "good evening user"
fi
echo "program terminated"