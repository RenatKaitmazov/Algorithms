import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func insertionSort<T: Comparable>(inout arr: [T]) {
    for i in 1..<arr.count {
        let key = arr[i]
        var j = i
        while j > 0 && arr[j - 1] > key {
            arr[j] = arr[j - 1]
            j--
        }
        if j != i {
            arr[j] = key
        }
    }
}
