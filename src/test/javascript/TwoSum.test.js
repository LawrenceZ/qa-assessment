import { expect } from "chai";

describe('twoSum', function() {
    it('should return indices of the two numbers such that they add up to the target', function() {
        const nums = [3, 2, 15, 11, 7];
        const target = 9;
        const result = twoSum(nums, target);
        console.log(result);
        expect(result).to.deep.equal([1, 4]);
    });

    it('should return an empty array if no two numbers add up to the target', function() {
        const nums = [1, 2, 3];
        const target = 6;
        const result = twoSum(nums, target);
        expect(result).to.deep.equal([]);
    });
});

// version 1
// function twoSum(nums, target) {
//     const numMap = {};
//     for (let i = 0; i < nums.length; i++) {
//         const complement = target - nums[i];
//         if (numMap[complement] !== undefined) {
//             return [numMap[complement], i];
//         }
//         numMap[nums[i]] = i;
//     }
//     return [];
// }

// version 2
function twoSum(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return [i, j];
            }
        }
    }
    return [];
}