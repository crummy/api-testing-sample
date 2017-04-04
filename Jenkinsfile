#!groovy

node {
    tools {
        mvn "M3"
    }
    stage("build jar") {
        sh "mvn --batch-mode package"
    }
    stage("build docker image") {
        def image = docker.build("apitestingsample:${BRANCH_NAME}_${BUILD_NUMBER}", ".")
        image.push()
    }
}