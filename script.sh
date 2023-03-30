javac -classpath $CLASSPATH:Framework/src/main/java/etu2034/classes -d Framework/src/main/java/etu2034/classes Framework/src/main/java/etu2034/framework/annotation/MethodAnnotation.java
javac -classpath $CLASSPATH:Framework/src/main/java/etu2034/classes -d Framework/src/main/java/etu2034/classes Framework/src/main/java/etu2034/framework/Mapping.java
javac -classpath $CLASSPATH:Framework/src/main/java/etu2034/classes -d Framework/src/main/java/etu2034/classes Framework/src/main/java/etu2034/framework/servlet/FrontServlet.java

echo "qwee"
cd Framework/src/main/java/etu2034/classes/
ls
jar -cf jars/framework.jar etu2034
cd jars
pwd
ls
jar -tf framework.jar

cp -f /Users/valisoa/IdeaProjects/Framework_Servlet/Framework/src/main/java/etu2034/classes/jars/framework.jar /Users/valisoa/IdeaProjects/Framework_Servlet/Test/src/main/webapp/WEB-INF/lib

export CLASSPATH=$CLASSPATH:.:/Users/valisoa/IdeaProjects/Framework_Servlet/Test/src/main/webapp/WEB-INF/lib/framework.jar

javac -classpath $CLASSPATH:/Users/valisoa/IdeaProjects/Framework_Servlet/Test/src/main/webapp/WEB-INF/classes -d /Users/valisoa/IdeaProjects/Framework_Servlet/Test/src/main/webapp/WEB-INF/classes  /Users/valisoa/IdeaProjects/Framework_Servlet/Test/src/main/java/com/example/test/Andrana.java

cd /Users/valisoa/IdeaProjects/Framework_Servlet/Test/src/main/webapp/

pwd
ls
jar -cf ./test-framework.war ./WEB-INF
pwd
ls

cp ./test-framework.war /Applications/apache-tomcat-10.0.27/webapps
pwd