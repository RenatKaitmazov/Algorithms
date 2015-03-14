import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func bubbleSort<T: Comparable>(inout arr: [T]) {
    for var i = arr.count - 1; i > 0; i-- {
        for var j = 0; j < i; j++ {
            if arr[j] > arr[j + 1] {
                swap(index: j, withIndex: j + 1, inArray: &arr)
            }
        }
    }
}
