def fib(n):
  if n == 1:
    return [0,1]
  else:
    s = fib(n - 1)
    s.append(s[len(s) - 1] + s[len(s) - 2])
    return s

print(fib(8))
