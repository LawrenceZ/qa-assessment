const assert = require("assert");
const { expect } = require("chai");

const firstNumbers = [1, 2, 3, 4, 1]; // returns 5
describe("Find disappeared numbers", function () {
  it("should return the missing numbers", function () {
    const firstResult = findDisappearedNumbers(firstNumbers);
    console.log("findDisappearedNumbers firstResult: " + firstResult);
    expect(firstResult).to.eql([5]);
  });
});

function findDisappearedNumbers(numbers) {
  const newSet = new Set(numbers);
  const result = [];
  for (let i = 1; i <= numbers.length; i++) {
    if (!newSet.has(numbers[i])) {
      result.push(i);
    }
  }
  return result;
}
