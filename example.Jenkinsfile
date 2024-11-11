def myStage(name) {
    stage(name) {
        echo "$name"
    }
}

myStage('pre-parallel')

parallel p1: {
    myStage('p1-0')
    parallel 'p1-1-1': {
        myStage('p1-1-1')
    },'p1-1-2': {
        stage("p1-1-2") {
           echo "Sh"
           sh "hostname"
        }
    }
    myStage('p1-2')
}, p2: {
    myStage('p2')
}

myStage('post-parallel')