import UIKit
func swap<T: Comparable>(index i: Int, withIndex j: Int, inout inArray arr: [T]) {
    let temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

func cocktailSort<T: Comparable>(inout arr: [T]) {
    var i = 0, j = arr.count - 1
    var k: Int
    while j > i {
        for k = i; k < j; k++ {
            if arr[k] > arr[k + 1] {
                swap(index: k, withIndex: k + 1, inArray: &arr)
            }
        }
        j--

        for k = j; k > i; k-- {
            if arr[k] < arr[k - 1] {
                swap(index: k, withIndex: k - 1, inArray: &arr)
            }
        }
        i++
    }
}
