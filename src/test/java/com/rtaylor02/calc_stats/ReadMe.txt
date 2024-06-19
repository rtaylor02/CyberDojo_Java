Your task is to process a sequence of integer numbers to determine the following statistics:

    o) minimum value
    o) maximum value
    o) number of elements in the sequence
    o) average value

For example: [6, 9, 15, -2, 92, 11]

    o) minimum value = -2
    o) maximum value = 92
    o) number of elements in the sequence = 6
    o) average value = 21.833333

===========
Test cases
===========
GIVEN an array of numbers [6, 9, 15, -2, 92, 11]
WHEN calcStats() method is called
THEN minimum, maximum, number of elements, and average value is given in a result array, e.g. [-2, 92, 6, 21.833333]

GIVEN an empty array of numbers []
WHEN calcStats() method is called
THEN IllegalArgumentException is thrown

GIVEN an array consisting only 1 number [3]
WHEN calcStats() method is called
THEN minimum, maximum, number of elements, and average value is given in a result array, e.g. [3, 3, 3, 3]