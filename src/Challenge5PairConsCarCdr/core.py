
"""
My solution to Challenge 5:

cons(a,b) constructs a pair and car(pair) and cdr(pair) returns the first and last element of that pair, respectively. For example, car(cons(3,4)) returns 3, and cdr(cons(3,4)) returns 4.

The implementation of cons was given in the problem.

"""

def cons(a,b):
    def pair(f):
        return f(a,b)
    return pair

def car(pair):
    def f(a,b):
        return a
    return pair(f)

def cdr(pair):
    def f(a,b):
        return b
    return pair(f)

