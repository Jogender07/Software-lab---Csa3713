@echo off
set "JAVA_HOME=C:\Program Files\Java\jdk-27"
set "PATH=%JAVA_HOME%\bin;%PATH%"
"c:\smilewell\tools\apache-maven-3.9.6\bin\mvn.cmd" %*
