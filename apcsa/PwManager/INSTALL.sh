#!/bin/bash

# Clone the repository

git clone https://github.com/tabbyistrans/pwmanager.git

# Change directory to the cloned repository
cd PWManager

# Add App.java to the path
export PATH=$PATH:`pwd`

# Run the script
java App.java