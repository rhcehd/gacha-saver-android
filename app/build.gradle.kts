plugins {
    alias(libs.plugins.gachasaver.android.application)
    alias(libs.plugins.gachasaver.android.application.compose)
    alias(libs.plugins.gachasaver.android.hilt)
}

android {
    namespace = "dev.rhcehd123.gachasaver"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.rhcehd123.gachasaver"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":core-designsystem"))
    implementation(project(":core-data"))

    implementation(project(":feature-gachahistory"))

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")

    // google play games
    //implementation("com.google.android.gms:play-services-games-v2:19.0.0")

    // google play service
    //implementation("com.google.android.gms:play-services-auth:21.1.0")

    // google credential manager
    val credential_version = "1.2.2"
    implementation("androidx.credentials:credentials:$credential_version")
    implementation("androidx.credentials:credentials-play-services-auth:$credential_version")
    implementation("com.google.android.libraries.identity.googleid:googleid:1.1.0")

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")

    implementation(libs.androidx.navigation.compose)
}