function swap(arr, i, j) {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

const arr = [2, 23, 21, 8, 7, 3];
console.log(arr);
swap(arr, 1, 5);
console.log(arr);
