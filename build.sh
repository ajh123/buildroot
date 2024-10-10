#!/bin/bash

ORIGINAL_PATH=${PATH}

NEW_PATH=$(echo ${PATH} | sed -e "s-:/mnt.*--")
export PATH=${NEW_PATH}

make

PATH=${ORIGINAL_PATH}
export PATH=${NEW_PATH}
