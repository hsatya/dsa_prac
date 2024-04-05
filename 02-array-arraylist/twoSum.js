// var twoSum = function (nums, target) {
//   let res = [0, 0];
//   const l = nums.length;
//   for (let i = 0; i < l - 1; ++i) {
//     for (let j = i + 1; j < l; ++j) {
//       if (nums[i] + nums[j] === target) {
//         res[0] = i;
//         res[1] = j;
//         return res;
//       }
//     }
//   }
//   return res;
// };

// var twoSum = function (nums, target) {
//   const n = nums.length;
//   const ans = {};

//   for (let i = 0; i < n; ++i) {
//     const index = ans[nums[i]];
//     if (index != undefined) {
//       return new Array(index, i);
//     } else {
//       ans[target - nums[i]] = i;
//     }
//   }
//   return new Array(-1);
// };

var twoSum = function (nums, target) {
  let dict = {}; // val : index
  for (let i = 0; i < nums.length; i++) {
    if (dict[target - nums[i]] !== undefined) {
      // return [ dict[target - nums[i]], i ]
      dict[nums[i]] = i;
    } else {
      dict[nums[i]] = i;
    }
  }
  console.log(dict);
};
twoSum([2, 7, 11, 15], 9);

// console.log(twoSum([2, 7, 11, 15], 9));
