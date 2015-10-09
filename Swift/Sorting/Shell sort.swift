import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func shellSort<T: Comparable>(inout arr: [T]) {
    var pace = arr.count / 2
    while pace > 0 {
        for var i = pace; i < arr.count; i++ {
            let key = arr[i]
            var j = i - pace
            while j >= 0 && arr[j] > key {
                arr[j + pace] = arr[j]
                j -= pace
            }
            if j != i - pace {
                arr[j + pace] = key
            }
        }
        if pace == 2 { pace = 1 }
        pace /= 2
    }
}
