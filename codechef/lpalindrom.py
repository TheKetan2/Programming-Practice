n = int(input())
for i in range(n):
    word = input()
    left = "".join(map(str, sorted(list(word[len(word) - int(len(word) / 2) :]))))
    right = "".join(map(str,sorted(list(word[:int(len(word)/2)]))))
    if left == right:
        print("YES")
    else:
        print("NO")