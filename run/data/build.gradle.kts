plugins {
    alias(libs.plugins.runningtracker.android.library)
}

android {
    namespace = "me.anisjamadar.run.data"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:database"))
    implementation(project(":run:domain"))
}