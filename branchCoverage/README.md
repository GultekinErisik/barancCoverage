Implement tests to improve the branch coverage. You are given a project that does not have any tests and the test coverage is very low (8%). You are expected to increase the test coverage to 100% by implementing junit tests. You are going to use jacoco to measure the current test coverage numbers. You are also going to use mockito for mocking when needed.

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.mycompany.app</groupId>
  <artifactId>my-app</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>my-app</name>
  <url>http://maven.apache.org</url>

  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>

    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.mockito/mockito-all -->
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-all</artifactId>
      <version>1.9.5</version>
    </dependency>

  </dependencies>

  <build>
    <plugins>   
      <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.7.6.201602180812</version>
        <configuration>
            <excludes>
              <exclude>com/mycompany/app/**/*</exclude>
            </excludes>
        </configuration>
        <executions>
            <execution>
                <id>prepare-agent</id>
                <goals>
                    <goal>prepare-agent</goal>
                </goals>
            </execution>
        </executions>
      </plugin>
    </plugins>
  </build
></project>

