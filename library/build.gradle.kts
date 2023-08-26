import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.vanniktech)
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "library"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.material3)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
                implementation(libs.kotlinx.coroutines.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.dokar.chiptextfield"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}

mavenPublishing {
    pom {
        name.set("ChipTextField")
        description.set("A description of what my library does.")
        inceptionYear.set("2023")
        url.set("https://github.com/Al-Taie/ChipTextField/")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("Al-Taie")
                name.set("Ahmed Mones")
                url.set("https://github.com/Al-Taie/")
            }
        }
        scm {
            url.set("https://github.com/Al-Taie/ChipTextField/")
            connection.set("scm:git:git://github.com/Al-Taie/ChipTextField.git")
            developerConnection.set("scm:git:ssh://git@github.com/Al-Taie/ChipTextField.git")
        }
    }

    publishToMavenCentral(SonatypeHost.S01)
    signAllPublications()
}
