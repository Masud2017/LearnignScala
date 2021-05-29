#!/usr/bin/bash
ext='.scala'
if [ -e $1${ext} ];then
echo "File exist"
scalac $1${ext}
scala $1
else
	echo "File does not exist please do something else"
fi

rm Main.class
