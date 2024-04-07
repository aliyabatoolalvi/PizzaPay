plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.aliya.pizzapay"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.aliya.pizzapay"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        viewBinding=true
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // splash animation

    implementation(libs.lottie.v640)

    implementation(libs.retrofit)
    implementation(libs.okio)
    implementation(libs.okhttp)
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.11.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.0")
    // picasso
    implementation("com.squareup.picasso:picasso:2.8")



    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.gson)
    //room sql database for persistence
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)
}