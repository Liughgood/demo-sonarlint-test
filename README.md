I find  `name.remal.sonarlint 3.1.0` can't find some junit issues like java:S2699, java:S5785, java:S5778.

For example `java:S5785` can't be found from [ApiSecondServiceTest](com.example.demosonarlinttest.package1.api2.ApiSecondServiceTest) when the configuration like [build.gradle](build.gradle).


**But** when I set sourceSets to testSourceSets and run `./gradlew clean sonarlintTest`, `java:S5785` can be found again. This makes me confused.
