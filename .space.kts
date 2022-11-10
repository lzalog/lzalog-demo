job("Build and push Docker") {
    docker {
        build {
            file = "./Dockerfile"
        }
        push("spacedemolz.registry.jetbrains.space/p/dating-app/docker-demo/myimage") {
            tags("version1.0")
        }
    }
}

job("Build and push Docker") {
 
   docker {
 
       build {
 
           context = "docker"
 
           file = "./docker/Dockerfile"
 
       }

       push("demo.registry.jetbrains.space/p/atm/demo/myimage") {
 
           tags("version1.0")
 
       }
 
   }

}
