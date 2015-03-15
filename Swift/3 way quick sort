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

func quickSort<T: Comparable>(inout arr: [T], start s: Int, end e: Int) {
    if s >= e { return }
    let pivot = median(ofIndex: s, andIndex: e, inArray: &arr)
    var k = s + 1, i = s + 1, j = e - 1
    while j >= i {
        if pivot > arr[i] {
            if k != i { swap(index: i, withIndex: k, inArray: &arr) }
            i++
            k++
        } else if pivot < arr[i] {
            if j != i { swap(index: i, withIndex: j, inArray: &arr) }
            j--
        } else {
            i++
        }
    }
    if j > s { quickSort(&arr, start: s, end: j - 1) }
    if i < e { quickSort(&arr, start: i, end: e) }
}
