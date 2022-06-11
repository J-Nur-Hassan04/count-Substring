# count-Substring

Problem statement:

Given a binary string find the number of substring that can formed such that every substring starts with '1' and ends with '1'.

Now we have total number of '1'. Finding no of substring starting with '1' & ending with '1' is equivalent of choosing two '1's out of total no of '1's (count). 
We are not at all bothered how many zeros are in between those two '1'. In fact, there can be '1's in between those two '1's picked up.
Thus,
number of substrings starting with '1' & ending with '1'[(count * (count -1)) /2]  where count is the frequency of '1's in the string
