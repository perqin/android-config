package com.perqin.androidconfig

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidConfigPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        if (project.plugins.hasPlugin(AppPlugin::class.java)) {
            project.extensions.getByType(AppExtension::class.java).applicationVariants.all {
                // TODO: Merge config list into one containing all config for current variant
                it.buildConfigField("String", "CHANNEL", "\"default\"")
            }
        }
    }
}
