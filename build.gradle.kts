buildscript {
    repositories {
        google()
        maven { setUrl("https://dl.google.com/dl/android/maven2/") }
        maven { setUrl("https://mirrors.huaweicloud.com/repository/maven/") } // Huawei Maven mirrors
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${property("ANDROID_BUILD_VERSION")}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${property("KOTLIN_VERSION")}")
        classpath("com.novoda:bintray-release:${property("BINTRAY_RELEASE_VERSION")}")
    }
}

allprojects {
    repositories {
        google()
        maven { setUrl("https://dl.google.com/dl/android/maven2/") }
        maven { setUrl("https://mirrors.huaweicloud.com/repository/maven/") } // Huawei Maven mirrors
        maven { setUrl("https://dl.bintray.com/panpf/maven") }
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
