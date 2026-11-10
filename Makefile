JC = Javac
JVM = Java
JFLAGS = -g
TARGET = MyFirstGUI2

all: $(TARGET).class

$(TARGET).class: $(TARGET).java
	$(JC) $(JFLAGS) $(TARGET).java

run: $(TARGET).class
	$(JVM) $(TARGET)

clean:
	rm -f *.class
