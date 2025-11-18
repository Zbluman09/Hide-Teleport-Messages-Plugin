plugins {
    java
}

group = "com.z.hidetp"
version = "1.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")
}

tasks.jar {
    archiveBaseName.set("HideTeleportMessages")
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
