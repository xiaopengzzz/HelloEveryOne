@echo off
title ͨ�� Git ͬ��.. 
::Start...
echo Start synchronizing...

echo Commit changes...

:: get date and time 
for /e "delims=" %%a in ('Git Download\HelloEveryOne') do @set mydate=%%a 
set fvar=%mydate%%mytime% 

:: add all new files 
call git add . 
call git commit -a -m "Automated commit on %fvar%"

:: push to the server. Default in "origin" remote, "master" branch
call git push
exit
