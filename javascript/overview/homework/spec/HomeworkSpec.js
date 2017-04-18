describe("Homework", function(){
  var homework = require('../homework');

  it("should print the nth fibonacci number", function() {
    expect(homework.fibonacci(0)).toEqual(0);
    expect(homework.fibonacci(1)).toEqual(1);
    expect(homework.fibonacci(2)).toEqual(1);
    expect(homework.fibonacci(3)).toEqual(2);
    expect(homework.fibonacci(10)).toEqual(55);
    expect(homework.fibonacci(13)).toEqual(233);
  });

  it("should sort integer array", function() {
    expect(homework.sort([])).toEqual([]);
    expect(homework.sort([1])).toEqual([1]);
    expect(homework.sort([2,1])).toEqual([1,2]);
    expect(homework.sort([1,1])).toEqual([1,1]);
    expect(homework.sort([-1,1,0])).toEqual([-1,0,1]);
  });

  it("should print the factorial of n", function() {
    expect(homework.factorial(0)).toEqual(1);
    expect(homework.factorial(1)).toEqual(1);
    expect(homework.factorial(2)).toEqual(2);
    expect(homework.factorial(3)).toEqual(6);
    expect(homework.factorial(16)).toEqual(20922789888000);
  });

  it("should rotate array to the left n times", function() {
    expect(homework.rotateLeft([1,2,3,4,5], 1)).toEqual([2,3,4,5,1]);
    expect(homework.rotateLeft([1,2,3,4,5], 6)).toEqual([2,3,4,5,1]);
    expect(homework.rotateLeft([1,2,3,4,5], 3)).toEqual([4,5,1,2,3]);
    expect(homework.rotateLeft([1,2,3,4,5], 0)).toEqual([1,2,3,4,5]);
  });

  it("should verify that brackets are balanced", function() {
    expect(homework.balancedBrackets("()")).toEqual(true);
    expect(homework.balancedBrackets("()()")).toEqual(true);
    expect(homework.balancedBrackets("(())")).toEqual(true);
    expect(homework.balancedBrackets("({[]})")).toEqual(true);

    expect(homework.balancedBrackets("(")).toEqual(false);
    expect(homework.balancedBrackets(")")).toEqual(false);
    expect(homework.balancedBrackets("(()")).toEqual(false);
    expect(homework.balancedBrackets("([)]")).toEqual(false);

  });

});
