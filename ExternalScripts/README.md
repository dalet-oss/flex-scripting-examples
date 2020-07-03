This repository demonstrates how Flex external scripts can be written, unit tested and compiled into a JAR, ready to
 be used in scripting actions. JAR files can be referenced in Flex via the `JAR File URLs` configuration field, and can be
  deployed via HTTP, FTP or file paths.

To use this project you will need to install [Gradle](https://gradle.org/) (v6.5 or above).

The folder `src/main/groovy` contains an example class CreateNewAssetScript, which creates a simple placeholder asset. The
 corresponding unit test can be found in `test/main/groovy`
 
To build the project, which executed the unit tests and creates the JAR, from the command line, run:
```
gradle build
```
The built JAR file can be found in `build/libs/`