plugins {
    alias(libs.plugins.runningtracker.android.library)
}

android {
    namespace = "me.anisjamadar.run.network"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:data"))
}