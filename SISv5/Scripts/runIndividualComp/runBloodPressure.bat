@echo off
title BloodPressure

javac -sourcepath ../../Components/BloodPressure -cp ../../Components/* ../../Components/BloodPressure/*.java
pause
start "BloodPressure" /D"../../Components/BloodPressure" java -cp .;../* CreateBloodPressure