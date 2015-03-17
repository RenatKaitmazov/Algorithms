import UIKit
func merge(inout array arr: [Int], inout axuiliaryArray aux: [Int], #firstIndex: Int, #midIndex: Int, #lastIndex: Int) {
    for var i = firstIndex; i <= lastIndex; i++ {
        aux[i] = arr[i]
    }

    var i = firstIndex, j = midIndex + 1
    for var k = firstIndex; k <= lastIndex; k++ {
        if i > midIndex {
            arr[k] = aux[j]
            j++
        } else if j > lastIndex {
            arr[k] = aux[i]
            i++
        } else if aux[j] < aux[i] {
            arr[k] = aux[j]
            j++
        } else {
            arr[k] = aux[i]
            i++
        }
    }
}

func sort(inout array arr: [Int], inout auxiliaryArray aux: [Int], #firstIndex: Int, #lastIndex: Int) {
    if firstIndex == lastIndex { return }
    let midIndex = firstIndex + (lastIndex - firstIndex) / 2
    sort(array: &arr, auxiliaryArray: &aux, firstIndex: firstIndex, lastIndex: midIndex)
    sort(array: &arr, auxiliaryArray: &aux, firstIndex: midIndex + 1, lastIndex: lastIndex)
    merge(array: &arr, axuiliaryArray: &aux, firstIndex: firstIndex, midIndex: midIndex, lastIndex: lastIndex)
}

func mergeSort(inout arr: [Int]) {
    var aux = [Int](count: arr.count, repeatedValue: 0)
    sort(array: &arr, auxiliaryArray: &aux, firstIndex: 0, lastIndex: arr.count - 1)
}
