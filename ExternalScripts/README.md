This repository demonstrates how Flex external scripts can be written, unit tested and compiled into a JAR, ready to be
used in scripting actions. JAR files can be referenced in Flex via the `JAR File URLs` configuration field, and can be
deployed via HTTP, FTP or file paths.

The folder `src/main/groovy` contains an example class CreateNewAssetScript, which creates a simple placeholder asset.
The corresponding unit test can be found in `test/main/groovy`.

N.B.:
-  If you are within Dalet, you will have to update the `repositories` section of `build.gradle` to target the internal
   Nexus instance.
-  If you are outside Dalet, then as noted in `build.gradle` you will have to provide Nexus username & password
   properties to Gradle invocations, such as:
       `./gradlew build -PnexusExtUsername=${NEXUS_EXT_USERNAME} -PnexusExtPassword=${NEXUS_EXT_PASSWORD}`

To build the project, which executes the unit tests and creates the JAR, from the command line, run:
```
./gradlew build
```
The built JAR file can be found in `build/libs/`.
