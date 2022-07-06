job("Build and push Docker") {
    docker {
        build {
            file = "./Dockerfile"
        }
        push("spacedemolz.registry.jetbrains.space/p/dating-app/docker-python/myimage") {
            tags("version1.0")
        }
    }
}