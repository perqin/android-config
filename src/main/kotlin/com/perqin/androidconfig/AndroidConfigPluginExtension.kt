package com.perqin.androidconfig

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware

open class AndroidConfigPluginExtension(private val project: Project) {
    fun loadExt() {
        val ac = project.extensions.create("ac", AndroidConfigExt::class.java) as ExtensionAware
        ac.extensions.add("acProp", "acValue")
    }

    fun loadAndroid() {
        if (project.plugins.hasPlugin(AppPlugin::class.java)) {
            project.extensions.getByType(AppExtension::class.java).applicationVariants.all {
                // TODO: Merge config list into one containing all config for current variant
                it.buildConfigField("String", "CHANNEL", "\"default\"")
            }
        }
    }

    open class AndroidConfigExt

    companion object {
        const val NAME = "androidConfig"
    }
}
