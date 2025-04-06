#!/bin/bash

# Check if the user has provided a filename
if [ -z "$1" ]; then
  echo "Please provide a file name to save the git log."
  exit 1
fi

# Define the output file
output_file="$1"

# Run git log and redirect output to the specified file
git log > "$output_file"

# Notify the user that the log has been saved
echo "Git log has been saved to $output_file"
