#!/bin/bash

# Check if the user has provided a filename
if [ -z "$1" ]; then
  echo "Please provide a file name to save the git log and diffs."
  exit 1
fi

# Define the output file
output_file="$1"

# Get the git log and diff for each commit
{
  echo "Git Log and Code Changes - $(date)"
  echo "=============================================="
  echo ""

  # Loop through each commit in reverse order and append its details (git log and diff) to the file
  git log --pretty=format:"%H" --reverse | while read commit_hash; do
    # Write commit details to the file
    echo "Commit: $commit_hash" >> "$output_file"

    # Get commit details (author, date, message) and append to file
    git log --format="%an%n%ad%n%s" -n 1 $commit_hash >> "$output_file"

    # Show the code changes (diff) for each commit and append to the file
    echo "Changes:" >> "$output_file"
    git diff "$commit_hash^" "$commit_hash" >> "$output_file"

    echo "=============================================="
  done
} > "$output_file"

# Notify the user that the log and diffs have been saved
echo "Git log with diffs has been saved to $output_file"
