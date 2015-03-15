import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func quickSort<T: Comparable>(inout arr: [T], start s: Int, end e: Int) {
    if s >= e { return }
    let pivot = arr[(e - s) / 2 + s]
    var i = s, j = e
    while j >= i {
        while pivot > arr[i] { i++ }
        while pivot < arr[j] { j-- }
        if j >= i {
            swap(index: i, withIndex: j, inArray: &arr)
            i++
            j--
        }
    }
    if i > s { quickSort(&arr, start: s, end: j) }
    if j < e { quickSort(&arr, start: i, end: e) }
}
