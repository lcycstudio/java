## Area Calculator
Write a method named **area** with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value please check the tips below.

Examples of input/output:
- area(5.0); should return 78.53975
- area(-1);  should return -1 since the parameter is negative
- area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
- area(-1.0, 4.0);  should return -1 since first the parameter is negative


## Minutes To Years and Days Calculator
Write a method **printYearsAndDays** with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.\
YY represents the calculated years.\
ZZ represents the calculated days.

EXAMPLES OF INPUT/OUTPUT:
- printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
- printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
- printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"


## Equality Printer
Write a method **printEqual** with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".

EXAMPLES OF INPUT/OUTPUT:
- printEqual(1, 1, 1); should print text All numbers are equal
- printEqual(1, 1, 2); should print text Neither all are equal or different
- printEqual(-1, -1, -1); should print text Invalid Value
- printEqual(1, 2, 3); should print text All numbers are different


## Playing Cat
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.

Write a method **isCatPlaying** that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false

1st parameter should be of type boolean and be named summer it represents if it is summer. \
2nd parameter represents the temperature and is of type int with the name temperature.

EXAMPLES OF INPUT/OUTPUT:
- isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 
- isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
- isCatPlaying(false, 35); should return true since temperature is in range 25 - 35 

