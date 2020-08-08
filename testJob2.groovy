freeStyleJob('example-new-1') {
    logRotator(-1, 10)
    scm {
        git {
            branch('master')
            remote {
                url("https://bitbucket.org/ram_kannan/devops_app_e2e_workflow.git")
            }
        }
    }
    
    steps {
        shell('mvn clean install')
    }
    
}
