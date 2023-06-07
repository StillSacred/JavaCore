FROM openjdk:21-jdk

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out ./src/programm/Main.java

CMD java -classpath ./out programm.Main