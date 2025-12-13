README.txt: How to run a Tournament

Strategies are coded up as Ultimatum_{strategy name}. To add a player that runs a strategy, add {strategy name}
as a line to the strategies.txt file. Strategies can be added multiple times to represent multiple players.
Run "make test" in the terminal to run. Results will be outputted to a results.csv file. Rename the file to save
the csv, otherwise it will be overwritten by other runs. The other files are used to code the structure of the 
strategy design assignment and specifications.

Original COS445 assignment README:

README.txt: Quick guide to coding up your strategy

For this assignment you have to implement the interface Ultimatum.java and create a file
named "Ultimatum_netid.java" containing your strategy.
A brief tour of what each file does:
Ultimatum_*.java - Sample strategies
Ultimatum.java - the interface that your "Ultimatum_netid.java" must implement.
Tournament.java - A tournament infrastucture that will be the same across Strategy Designs.
Simulator.java - Extends Tournament.java and helps run the tournament.
strategies.txt - A list of all the contesting strategies that are applying. This is so that you 
can test your strategies against each other and the sample strategies. Similarly, you do not have to understand or modify any of these files except Ultimatum_netid.java and strategies.txt for testing.
To start, read Ultimatum.java. You have to implement functions cheapTalk(..), propose(..), and accept(..), and 
you can modify setup(..) if you like. You can test your strategy as usual via editing "strategies.txt" and calling "make test".
Test your strategy against others by uploading it to the leadboard via the leaderboard Tigerfile link 
(as opposed to the submission link). As a reminder, this is for your reference only - grading will 
be independent of the leaderboard!
After you submit your code, remember to use the "check your submission" button to make sure your code compiles, and that
everything makes sense to you.
Have fun!