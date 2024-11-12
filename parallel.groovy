node('local') {
    String[] arr = [ "one","two","three",'four','five' ]
    echo "Running commands: ${arr}"
    int top = arr.size()
    echo "top is ${top}"
    def stepsForParallel = [:]

    for (int i = 0; i < arr.size(); i++) {
        def it = arr[i]
        def stepName = "running ${it}"
        stepsForParallel[stepName] = { ->
            echo "${it}"
            sh "python3 -c 'import random; exit((int)(random.random()>0.5))'"
        }
    }
    parallel stepsForParallel
}
