def myStage(name) {
    stage(name) {
        echo "$name"
        sh "python3 test.py"
    }
}

myStage('pre-parallel')

parallel p1: {
    myStage('p1-0')
    parallel 'p1-1-1': {
        myStage('p1-1-1')
    },'p1-1-2': {
        myStage('p1-1-2')
    }
    myStage('p1-2')
}, p2: {
    myStage('p2')
}

myStage('post-parallel')