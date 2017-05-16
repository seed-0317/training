import lab

def test_fibonacci():
    assert lab.fibonacci(0)  == 0
    assert lab.fibonacci(1)  == 1
    assert lab.fibonacci(2)  == 1
    assert lab.fibonacci(3)  == 2
    assert lab.fibonacci(10) == 55
    assert lab.fibonacci(13) == 233

def test_factorial():
    assert lab.factorial(0)  == 1
    assert lab.factorial(1)  == 1
    assert lab.factorial(2)  == 2
    assert lab.factorial(3)  == 6
    assert lab.factorial(10) == 3628800

def test_balanced_brackets():
    assert lab.balanced_brackets("()") == True
    assert lab.balanced_brackets("()()") == True
    assert lab.balanced_brackets("(())") == True
    assert lab.balanced_brackets("({[]})") == True
    assert lab.balanced_brackets("({[]}())") == True

    assert lab.balanced_brackets("(") == False
    assert lab.balanced_brackets(")") == False
    assert lab.balanced_brackets("(()") == False
    assert lab.balanced_brackets("([)]") == False
