package com.apple.iad.toro.plugins

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Exec
import java.io.File
import groovy.json.JsonSlurper
import groovy.io.FileType
import java.nio.file.Paths

class CircleCi extends DefaultTask {
  @TaskAction
  def hello() {
    print "\n Hello CircleCi!! "
  }
}
