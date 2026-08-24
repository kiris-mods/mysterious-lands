plugins {
    id("dev.upcraft.gradle.multiloader")
    id("net.fabricmc.fabric-loom-companion")
    id("net.neoforged.moddev")
}

neoForge.neoFormVersion = libs.versions.neoform.get()

val modID = providers.gradleProperty("mod_id").get()

multiLoader {
    javaVersion = libs.versions.java.map { it.toInt() }
    minecraftVersion = libs.versions.minecraft

    applyMetadataReplacements(listOf("pack.mcmeta", "*.mixins.json"))
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
    compileOnly(libs.jei.api)

    compileOnly(libs.resourcefulconfig)
}

neoForge {
    mods {
        register(modID) {
            sourceSet(sourceSets["main"])
        }
    }
}
