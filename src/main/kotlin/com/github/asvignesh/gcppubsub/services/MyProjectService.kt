package com.github.asvignesh.gcppubsub.services

import com.intellij.openapi.project.Project
import com.github.asvignesh.gcppubsub.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
