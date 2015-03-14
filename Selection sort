import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func selectionSort<T: Comparable>(inout arr: [T]) {
    var minIndex: Int
    for i in 0..<arr.count {
        minIndex = i
        for j in i + 1..<arr.count {
            if arr[j] < arr[minIndex] {
                minIndex = j
            }
        }
        if minIndex != i {
            swap(index: i, withIndex: minIndex, inArray: &arr)
        }
    }
}
