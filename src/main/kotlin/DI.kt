package com.example

import com.example.model.FakeTaskRepository
import com.example.model.TaskRepository
import io.ktor.server.application.*
import io.ktor.server.plugins.di.*

fun Application.configureDependencyInjection() {
    dependencies {
        provide<TaskRepository> {
            FakeTaskRepository()
        }
    }
}
