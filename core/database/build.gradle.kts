plugins {
    alias(libs.plugins.runningtracker.android.library)
}

android {
    namespace = "me.anisjamadar.core.database"
}

dependencies {
    implementation(project(":core:domain"))
}