package com.github.marcustorndahl.mytheme.services

import com.intellij.openapi.project.Project
import com.github.marcustorndahl.mytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
