node('local') {
    String[] arr = [ "one","two","three",'four','five' ]
    def stepsForParallel = [:]

    for (int i = 0; i < arr.size(); i++) {
        def it = arr[i]
        def stepName = "running ${it}"
        stepsForParallel[stepName] = { ->
            echo "${it}"
            sh "python3 test.py"
        }
    }
    parallel stepsForParallel
}
