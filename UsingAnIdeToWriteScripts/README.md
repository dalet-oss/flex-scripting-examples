This repository demonstrates how Flex scripts can be written within an IDE, in order to provide code completion and
unit testing capabilities. Code written in this manner can also be managed by source control, although care needs to be
taken to keep the code in source control in sync with the scripts in Flex.

The folder `src/main/groovy` contains an example script class CreateNewAssetScript, which creates a simple placeholder
asset. The code can be copy and pasted from the class into a Flex scripting action `script` configuration field. There
is a correspondingunit test for this script in `test/main/groovy`.
 
N.B.:
-  If you are within Dalet, you will have to update the `repositories` section of `build.gradle` to target the internal
   Nexus instance.
-  If you are outside Dalet, then as noted in `build.gradle` you will have to provide Nexus username & password
   properties to Gradle invocations, such as:
       `./gradlew test -PnexusExtUsername=${NEXUS_EXT_USERNAME} -PnexusExtPassword=${NEXUS_EXT_PASSWORD}`

To compile and run the unit tests from the command line, run:
```
./gradlew test
```
