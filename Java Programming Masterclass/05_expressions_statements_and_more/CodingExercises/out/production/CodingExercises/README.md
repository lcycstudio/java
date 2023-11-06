## Positive, Negative or Zero
Write a method called **checkNumber** with an int parameter number.

The method should not return any value, and it needs to print out: \
"positive" if the parameter number is > 0 \
"negative" if the parameter number is < 0 \
"zero" if the parameter number is equal to 0


## Speed Converter
1. Write a method called **toMilesPerHour** that has 1 parameter of type double with the name kilometersPerHour. 

If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid 
value.

Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and 
rounding, check the notes in the text below.

Examples of input/output: \
toMilesPerHour(1.5); → should return value 1 \
toMilesPerHour(10.25); → should return value 6 \
toMilesPerHour(-5.6); → should return value -1 \
toMilesPerHour(25.42); → should return value 16 \
toMilesPerHour(75.114); → should return value 47

2. Write another method called **printConversion** with 1 parameter of type double with the name kilometersPerHour.

This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour 
parameter.

Then it needs to print a message in the format "XX km/h = YY mi/h".

XX represents the original value kilometersPerHour. \
YY represents the rounded milesPerHour from the kilometersPerHour parameter.

If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

Examples of input/output: \
printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h \
printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h \
printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value \
printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h \
printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h 

Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.


## MegaBytes Converter
Write a method called **printMegaBytesAndKiloBytes** that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the 
kilobytes parameter. Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.\
YY represents the calculated megabytes.\
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

EXAMPLE INPUT/OUTPUT
- printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
- printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
- printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"


## Barking Dog
We have a dog that likes to bark. We need to wake up if the dog is barking at night!

Write a method **shouldWakeUp** that has 2 parameters.

1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.\
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.

Examples of input/output:
- shouldWakeUp (true, 1); → should return true
- shouldWakeUp (false, 2); → should return false since the dog is not barking.
- shouldWakeUp (true, 8); → should return false, since it's not before 8.
- shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.


## Leap Year Calculator
Write a method **isLeapYear** with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

The following years are not leap years: \
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600 \
This is because they are evenly divisible by 100 but not by 400.

The following years are leap years: \
1600, 2000, 2400 \
This is because they are evenly divisible by both 100 and 400.

Examples of input/output:
- isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
- isLeapYear(1600); → should return true since 1600 is a leap year
- isLeapYear(2017); → should return false since 2017 is not a leap year
- isLeapYear(2000);  → should return true because 2000 is a leap year


## DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal 
places. Otherwise, return false.

EXAMPLES OF INPUT/OUTPUT:
- areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
- areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
- areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
- areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.