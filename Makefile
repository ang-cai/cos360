# COS 445 SD3, Spring 2019
# Created by Andrew Wonnacott

all: Simulator.class

sd3.zip: Simulator.java Makefile Ultimatum.java Tournament.java strategies.txt
	zip sd3 Simulator.java Makefile Ultimatum.java Tournament.java strategies.txt README.txt

test: results.csv
	@cat results.csv

results.csv: all strategies.txt
	java -ea Simulator strategies.txt > results.csv

Simulator.class: *.java
	javac -Xlint *.java

clean:
	rm -rf *.class results.csv sd3.zip
