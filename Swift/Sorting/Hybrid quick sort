import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func median<T: Comparable>(ofIndex i: Int, andIndex j: Int, inout inArray arr: [T]) -> T {
    let mid = (j - i) / 2 + i
    if arr[i] > arr[mid] { swap(index: i, withIndex: mid, inArray: &arr) }
    if arr[i] > arr[j] { swap(index: i, withIndex: j, inArray: &arr) }
    if arr[mid] > arr[j] { swap(index: mid, withIndex: j, inArray: &arr) }
    return arr[mid]
}

func insertionSort<T: Comparable>(inout arr: [T], start s: Int, end e: Int) {
    for var i = s + 1; i <= e; i++ {
        let key = arr[i]
        var j = i
        while j > s && arr[j - 1] > key {
            arr[j] = arr[j - 1]
            j--
        }
        if j != i { arr[j] = key }
    }
}

func quickSort<T: Comparable>(inout arr: [T], start s: Int, end e: Int) {
    if s >= e { return }
    if e - s <= 10 { insertionSort(&arr, start: s, end: e) }
    let pivot = median(ofIndex: s, andIndex: e, inArray: &arr)
    var i = s + 1, j = e - 1
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
