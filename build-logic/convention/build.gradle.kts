@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
}

group = "me.anisjamadar.runningtracker.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}
