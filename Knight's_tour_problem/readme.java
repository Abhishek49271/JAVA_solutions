Given an n × n chessboard with a Knight starting at the top-left corner (position (0, 0)). The task is to determine a valid Knight's Tour where where the Knight visits each cell exactly once following the standard L-shaped moves of a Knight in chess.
If a valid tour exists, print an n × n grid where each cell contains the step number (starting from 0) at which the Knight visits that cell. If no tour is possible, print -1.

Examples:

Input: n = 5
Output:  
0 5 14 9 20 
13 8 19 4 15 
18 1 6 21 10 
7 12 23 16 3 
24 17 2 11 22 
Explanation: The output represents one valid Knight's Tour on a 5x5 board. The number in each cell indicates the order in which it is visited starting from (0, 0) as step 0. 

Input: n = 3
Output: -1
Explanation: It is not possible to find a valid Knight's Tour on a 3x3 chessboard since the Knight cannot visit all 9 cells exactly once without revisiting or getting stuck.
