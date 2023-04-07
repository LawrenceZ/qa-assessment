const assert = require("assert");

describe("ContainDuplicate", function () {
  it("should return count of duplicates", function () {
    const count = getDuplicate([1, 2, 3, 4, 1]);
    assert.equal(count, 1);
  });
});

function getDuplicate(number) {
  let map = new Map();
  let counter = 0;
  for (let num of number) {
    if (map.has(num)) {
      map.set(num, map.get(num) + 1);
      if (map.get(num) === 2) {
        counter++;
      }
    } else {
      map.set(num, 1);
    }
  }
  return counter;
}
