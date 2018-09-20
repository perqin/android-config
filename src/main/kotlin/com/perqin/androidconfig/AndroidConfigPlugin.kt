package com.perqin.androidconfig

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidConfigPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create(
                AndroidConfigPluginExtension.NAME, AndroidConfigPluginExtension::class.java,
                project
        )
    }
}
