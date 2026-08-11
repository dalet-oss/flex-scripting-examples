# Using an IDE to Write Flex Scripts

This Maven project demonstrates how to write Flex scripts in an IDE with code completion, unit tests and source
control. Scripts managed in this repository must be kept in sync with the corresponding scripting action
configuration in Flex.

The example uses Java 21, matching the Flex service that executes Groovy scripts.

## IntelliJ IDEA setup

1. Open `pom.xml` as a project, or add it as a Maven module to an existing project.
2. Select a Java 21 JDK for the project and Maven runner.
3. Reload the Maven project when prompted.

Maven registers `src/main/groovy` and `src/test/groovy` as source roots. IntelliJ should therefore provide Groovy and
Flex SDK code completion without a separately downloaded Groovy SDK.

## Nexus credentials

The Flex SDK is hosted in the Flex Nexus repository. You can add Nexus directly as a Maven repository in IntelliJ IDEA
under **Settings | Build, Execution, Deployment | Build Tools | Maven | Repositories**.

The preferred option is to configure Nexus as a mirror in `~/.m2/settings.xml`. This applies consistently to Maven on
the command line and to IntelliJ IDEA without adding machine-specific configuration to this repository:

```xml
<settings>
  <mirrors>
    <mirror>
      <id>nexus</id>
      <mirrorOf>*</mirrorOf>
      <name>Dalet Nexus</name>
      <url>https://nexus-internal.ooflex.net/repository/maven</url>
    </mirror>
  </mirrors>
</settings>
```

Dalet developers can use the corresponding internal Nexus URL in their system-level Maven configuration.

## Example script

`src/main/groovy/CreateNewAssetScript.groovy` creates a placeholder asset. Its `context` and `flexSdkClient` fields
exist only to give the IDE type information; Flex supplies those objects when it executes the script.

Copy the `execute` method into the Flex scripting action's `script` configuration field. The corresponding Mockito test
is in `src/test/groovy/CreateNewAssetScriptTest.groovy`.

## Test

Compile the script and run its unit test with:

```shell
mvn test
```
