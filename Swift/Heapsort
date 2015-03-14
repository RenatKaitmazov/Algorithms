import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func heapify<T: Comparable>(inout array arr: [T], ofSize size: Int, var fromIndex i: Int) {
    while 2 * i + 1 <= size {
        var maxChild = 2 * i + 1
        if maxChild < size && arr[maxChild] < arr[maxChild + 1] { maxChild++ }
        if arr[maxChild] < arr[i] { break }
        swap(index: i, withIndex: maxChild, inArray: &arr)
        i = maxChild
    }
}

func heapsort<T: Comparable>(inout arr: [T]) {
    //Build heap
    var size = arr.count - 1
    for var i = (size - 1) / 2; i >= 0; i-- {
        heapify(array: &arr, ofSize: size, fromIndex: i)
    }
    while size > 0 {
        swap(index: 0, withIndex: size, inArray: &arr)
        size--
        heapify(array: &arr, ofSize: size, fromIndex: 0)
    }
}
