# Babysitter Kata
This kata was created using Java 10, jUnit TDD Framework, Gradle to allow you to download and run the tests on your own computer, and Eclipse Photon as the IDE.

**[Steps to download and commands to run will go here as I gather that information.]**

## Description of kata
Taken from https://gist.github.com/jameskbride/5482722. 


This kata simulates a babysitter working and getting paid for one night. 

## Pre-coding thoughts:

- The goal of this exercise is to create a method that will output the amount of money the babysitter earns after the completion of one work day.
- The methods that we need to create that will give us that amount will require the following:
     - The **starting time** of the babysitter's shift.
     - The **ending time**.
     - The **bedtime** of the kid being babysitted.
     - The **pay rate** each family offers per shift.
- The complexity of this kata comes from figuring out how many hours the babysitter has worked for each shift in the workday to each family's pay rate. Once that is figured out, the rest is as simple as writing a mathematical algorithim that would multiply the amount paid for each shift by the hours worked per shift and add those values together to get the total earnings for that work day.

## Kata Buid Process

- The first step I took was to find a way to calculate the time the babysitter was allowed to work (starts no earlier than 5pm and no later than 4am). There were a few ways that I knew of and researched to do this such as coding the time in a 24-hour format using integers as well as using the SimpleDateFormat class to format and parse the times allotted in the kata; Both however, had downsides to using them. So when I take a look back at the constraints I noticed something about the times the babysitter was allowed to work. Specifically, it was how many time frames were available for the babysitter to work (12 in total) as well as how the babysitter gets paid by whole hours only. 
- I then realized that we could make a pseudo-list or a scale of the times using integers (from 1-12) where each number can correspond to a timeframe.
- We can make a method that will change the time entered for each shift into the number it corresponds to on the list. Afterwards we just do the following:
     - Take said numbers and create a method that will validate if those times are within the babysitter's availability as well as verify that the times don't overlap each other in any way (eg. 9pm start time and 7pm end time).
     - Create a method with the numbers to calculate hours worked for each shift.
     - Then create a method that will multiply the hours worked by the pay rate each family offers per shift to get the total earnings 
      the babysitter made for that work day.
