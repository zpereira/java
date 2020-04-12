JFLAGS = -g
#JFLAGS = -jar
JC = javac
OPT = -O3
#OPT = -g
WARN = -Wall

mainServer: mainServer.class

mainServer.class: mainServer.java
	$(JC) $(JFLAGS) mainServer.java

mainServer.jar: 
	jar cvfe mainServer.jar mainServer *.class

clean:
	$(RM) mainServer.class
