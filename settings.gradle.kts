rootProject.name = "Weather"

fun includeProject(name: String, filePath: String) {
    include(name)
    project(name).projectDir = File(filePath)
}
include(":app")
