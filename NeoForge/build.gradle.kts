plugins {
    id("dev.upcraft.gradle.multiloader")
    id("net.neoforged.moddev")
}

val modID = providers.gradleProperty("mod_id").get()

// need this before dependencies because it configures the plugin and creates additionalRuntimeClasspath configuration
neoForge.version = libs.versions.neoforge.get()

multiLoader {
    javaVersion = libs.versions.java.map { it.toInt() }
    minecraftVersion = libs.versions.minecraft

    loader = "neoforge"

    setCommonProject(":${rootProject.name}-Common")
    applyMetadataReplacements(listOf("pack.mcmeta", "*.mixins.json", "META-INF/neoforge.mods.toml"), mapOf(
        "neoforge_version" to libs.versions.neoforge
    ))
}

repositories {
    maven("https://maven.blamejared.com") {
        name = "BlameJared"
    }
    maven("https://maven.teamresourceful.com/repository/maven-releases") {
        name = "TeamResourceful"
    }
    maven("https://maven.tophatcat.dev") {
        name = "TopHatCat's Maven"
    }
}

dependencies {
    compileOnly(libs.jei.neoforge.api)
    "localRuntime"(libs.jei.neoforge)

    implementation(libs.resourcefulconfig.neoforge)
}

neoForge {
    mods {
        register(modID) {
            sourceSet(sourceSets["main"])
        }
    }

    runs {
        register("data") {
            clientData()
            gameDirectory = file("run/data")

            programArguments.addAll(
                "--mod", modID,
                "--all",
                "--flat",
                "--output", file("src/main/generated").absolutePath,
                "--existing", file("src/main/resources").absolutePath
            )
        }
    }
}

sourceSets["main"].resources { srcDir("src/main/generated") }
