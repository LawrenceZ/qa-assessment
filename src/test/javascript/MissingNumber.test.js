const assert = require("assert");
const { expect } = require("chai");

const firstNums = [0, 2, 3]; // returns 1
const secondNums = [0, 1];
const thirdNums = [9, 6, 4, 2, 3, 5, 7, 0, 1];

describe("Find missing number", function () {
  it("should return the missing number", function () {
    const firstResult = findMissingNumber(firstNums);
    console.log("firstResult: " + firstResult);
    expect(firstResult).to.eql(1);
  });
});

function findMissingNumber(numbers) {
  numbers.sort((a, b) => a - b);
  for (let i = 0; i <= numbers.length; i++) {
    if (numbers[i] != i) {
      return i;
    }
  }
  return numbers.length;
}
