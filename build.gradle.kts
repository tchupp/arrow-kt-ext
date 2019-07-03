plugins {
    base
    kotlin("jvm") version "1.3.40" apply false

    id("com.github.ben-manes.versions") version "0.21.0"
}

buildscript {
    repositories {
        jcenter()
    }
}

allprojects {
    group = "com.tchupp"
    version = "0.0.1-SNAPSHOT"

    repositories {
        jcenter()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}
