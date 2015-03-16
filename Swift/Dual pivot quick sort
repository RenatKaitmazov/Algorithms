import UIKit

func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func quickSort<T: Comparable>(inout arr: [T], start s: Int, end e: Int) {
    if s >= e { return }
    if arr[s] > arr[e] { swap(index: s, withIndex: e, inArray: &arr) }
    let pivot1 = arr[s], pivot2 = arr[e]
    var i = s + 1, k = s + 1, j = e - 1
    while j >= i {
        if pivot1 > arr[i] {
            if i != k {
                swap(index: i, withIndex: k, inArray: &arr)
            }
            i++
            k++
        } else if pivot2 < arr[i] {
            if i != j {
                swap(index: i, withIndex: j, inArray: &arr)
            }
            j--
        } else {
            i++
        }
    }
    swap(index: s, withIndex: k - 1, inArray: &arr)
    swap(index: i, withIndex: e, inArray: &arr)

    if j > s { quickSort(&arr, start: s, end: k - 1) }
    if j > k { quickSort(&arr, start: k, end: j) }
    if e > i { quickSort(&arr, start: i, end: e) }
}
