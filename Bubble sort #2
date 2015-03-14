import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func bubbleSort<T: Comparable>(inout arr: [T]) {
    var swapped = true
    var j = arr.count
    while swapped {
        swapped = false
        j--
        for var i = 0; i < j; i++ {
            if arr[i] > arr[i + 1] {
                swap(index: i, withIndex: i + 1, inArray: &arr)
                swapped = true
            }
        }
    }
}
