"""
power series : e^x = 1 + x + x^2 / 2! + x^3 / 3! + ... + x^n / n! （0 < x < 1）
"""
def doPowerSeries(x:int):
    n = term = 1
    result = 1.0
    while n<100:
        term *= x/n
        result += term
        print("n = {}, term = {}".format(n, term))
        n += 1
        if term < 0.0001:
            break

    return result
