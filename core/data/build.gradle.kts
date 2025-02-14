plugins {
    alias(libs.plugins.runningtracker.android.library)
}

android {
    namespace = "me.anisjamadar.core.data"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:database"))
}