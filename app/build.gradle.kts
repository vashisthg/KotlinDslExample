plugins {
    id("com.android.application")
    kotlin("android") // or id("com.android.application")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        applicationId = "com.vashisthg.kotlindslexample"
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = AppVersion.versionCode
        versionName = AppVersion.versionName
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), file("proguard-rules.pro"))
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.Kotlin.stdlib)
    implementation(Libraries.Support.appcompatV7)
    testImplementation(Libraries.Tests.junit)
    androidTestImplementation(Libraries.AndroidTests.testRunner)
    androidTestImplementation(Libraries.AndroidTests.espressoCore)
}