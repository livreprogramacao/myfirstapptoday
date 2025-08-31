import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType

KotlinPlatformType.androidJvm
buildscript {
    dependencies {
        // ... other project dependencies
        // Configure Firebase App
        // in tutorial was "com.google.gms:google-services:4.3.10" but the latest version is: "com.google.gms:google-services:4.4.3"
        classpath("com.google.gms:google-services:4.4.3")
        //classpath("androidx.appcompat:appcompat:1.6.1")
        //classpath("com.google.android.gms:play-services-ads:21.0.0")
        //classpath("androidx.lifecycle:lifecycle-extensions:2.2.0")
        //classpath("androidx.lifecycle:lifecycle-runtime:2.3.1")
        //classpath("org.connectbot.jbcrypt:jbcrypt:1.0.0")
        //implementation fileTree(dir: "libs";include: ["*.jar"])
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // id("com.android.application")
    // id("top.niunaijun.blackobfuscator")
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}