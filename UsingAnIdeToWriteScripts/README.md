This repository demonstrates how Flex scripts can be written within an IDE, in order to provide code completion and unit
 testing capabilities. Code written in this manner can also be managed by source control, although care needs to be taken to
  keep the code in source control in sync with the scripts in Flex.

To use this project you will need to install [Gradle](https://gradle.org/) (v6.5 or above).

The folder `src/main/groovy` contains an example script class CreateNewAssetScript, which creates a simple placeholder asset. The
 code can be copy and pasted from the class into a Flex scripting action `script` configuration field. There is a corresponding
  unit test for this script in `test/main/groovy`.
 
To build compile and run the unit tests from the command line, run:
```
gradle test
```
