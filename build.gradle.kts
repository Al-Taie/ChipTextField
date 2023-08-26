plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.multiplatform) apply false
    alias(libs.plugins.vanniktech) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
