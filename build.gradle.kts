buildscript {
    dependencies {
        // ... other project dependencies
        // in tutorial was "com.google.gms:google-services:4.3.10" but the latest version is: "com.google.gms:google-services:4.4.3"
        classpath("com.google.gms:google-services:4.4.3")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}