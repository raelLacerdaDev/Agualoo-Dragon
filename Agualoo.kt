fun agualoo (
    n : Int,
    m : Int,
    diameters: IntArray,
    heights: IntArray
) { // time: O(M log M + N log N) memory : O(log M + log N)

    var rewardTotal: Long = 0

    if (m < n) {
        println("Agualoo esta condenada!")
        return
    }

    heights.sort()
    diameters.sort()

    var h = 0
    var d = 0
    var remainingHead = n

    while (h < heights.size && d < diameters.size) {
        if (heights[h] < diameters[d]) {
            h += 1
            continue
        }
        rewardTotal += heights[h]
        h += 1
        d += 1
        remainingHead -= 1
    }

    if (remainingHead > 0) {
        println("Agualoo esta condenada!")
        return
    }

    println(rewardTotal)
}
