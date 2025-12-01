// hello.groovy
for (i in 0..2) {
    println "Hello $i"
}


// from ChatGPT for benchmarking:
def start = System.nanoTime()

for (i in 0..2) {
    println "Hello $i"
}

def end = System.nanoTime()
println "Loop elapsed: ${(end - start)/1e6} ms"

// I notice that Python is 3-5 orders of magnitude faster for this loop