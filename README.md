# test-coverage-sonarqube
Steps on how to create test coverage report
1.	Create a maven project or a test BDD framework using tools like Selenium,Java, Cucumber and TestNg or core test framework 
using tools like Selenium,Java and TestNg

2.	Download the latest version of SonarQube, Extract the package and from the bin directory run the command
i.e. ./sonar.sh start (for unix) to start the sonar qube server and make sure sonar is started by hitting the url http://localhost:9000

3.	Make sure maven is installed and in the path

4.	Now go to the Maven project directory in which pom.xml is present and run the command 
i.e.
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Pcoverage-per-test
This will create a jacoco report for the current maven project

5. Run the below command to upload the jacoco reports on the sonar qube
mvn sonar:sonar
