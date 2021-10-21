# NextRepo
last repo
next commit

The best way to check the condition in the statement is to use bitmasks. 
Iterate from 0 to 2n−1 and for each number consider its binary representation. 
If the i-th bit of the representation is set to 0, then decide to perform the i-th rotation clockwise. 
In the opposite case, do it counterclockwise. Finally, check if the whole angle is a multiple of 360 and if so, output "YES".
If no good combination of rotations was found, output "NO".

Dynamic Programming (commonly referred to as DP) is an algorithmic technique for solving a problem by recursively breaking it down into simpler subproblems and using the fact that the optimal 
solution to the overall problem depends upon the optimal solution to it’s individual subproblems.
The technique was developed by Richard Bellman in the 1950s.
DP algorithm solves each subproblem just once and then remembers its answer, 
thereby avoiding re-computation of the answer for similar subproblem every time.
It is the most powerful design technique for solving optimization related problems.
It also gives us a life lesson - Make life less complex. There is no such thing as big problem in life.
Even if it appears big, it can be solved by breaking into smaller problems and then solving each optimally.