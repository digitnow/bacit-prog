# Krav
java  --version
openjdk 16.0.1 2021-04-20 \
OpenJDK Runtime Environment (build 16.0.1+9-24) \
OpenJDK 64-Bit Server VM (build 16.0.1+9-24, mixed mode, sharing) 

junit fra ...

hamcrest fra ...

# Kompilering
..\bacit-prog\java>javac -cp .\junit-4.13.2.jar;. .\bacit\junit\ValutaAssertionTest.java

# Utørelse
..\bacit-prog\java>java -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar bacit.junit.TestRunner

# Mappestruktur
..\bacit-prog\java\
-------------------junit-4.13.2.jar
-------------------harcrest-core-1.3.jar
-------------------bacit\junit\
-------------------------------ValutaAssertionTest.java
-------------------------------TestRunner.java
-------------------------------NorskKrone.java

