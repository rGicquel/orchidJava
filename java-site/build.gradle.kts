/*plugins {
    id("com.eden.orchidPlugin") version "0.21.0"
}

version = "1.0.0"

// 1. Include all official Orchid plugins and themes
dependencies {
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidDocs:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidJavadoc:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPluginDocs:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidGithub:0.21.0")
}

// 2. Get Orchid from Jcenter
repositories {
    jcenter()
    maven(url = "https://kotlin.bintray.com/kotlinx/")
}
*/
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Buildscript dependencies and plugins
//----------------------------------------------------------------------------------------------------------------------

plugins {
    // Check latest version at https://plugins.gradle.org/plugin/com.eden.orchidPlugin
    id("com.eden.orchidPlugin") version "0.21.0"
    kotlin("jvm") version "1.3.72"
	java
    application

}

project.version = "1"

// Orchid setup
//----------------------------------------------------------------------------------------------------------------------
repositories {
    jcenter()
	 maven(url = "https://kotlin.bintray.com/kotlinx/")
}

dependencies {
    val orchid_version = "0.21.0"
 //   compile("io.github.javaeden.orchid:OrchidCore:$orchid_version")
 //   orchidCompile("io.github.javaeden.orchid:OrchidCore:$orchid_version")
/*    orchidRuntime("io.github.javaeden.orchid:OrchidPosts:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidPages:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidWiki:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidNetlify:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidNetlifyCMS:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidPluginDocs:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidSearch:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidWritersBlocks:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidSyntaxHighlighter:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidTaxonomies:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidFutureImperfect:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidAsciidoc:$orchid_version")*/
	orchidRuntimeOnly("io.github.javaeden.orchid:OrchidDocs:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidJavadoc:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPluginDocs:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidGithub:0.21.0")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidWiki:$orchid_version")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


repositories {
    jcenter()
	
}
application {
    mainClassName = "com.example.MainJava"
}


orchid {
    theme = "Editorial"
	version = "1.0.0"
	srcDir = "./app/src"
    destDir = "./build/docs/orchid"
}

