package com.github.bulgakovanton.plugin.services

import com.github.bulgakovanton.plugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
