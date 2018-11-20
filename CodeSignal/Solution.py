def isOneSwapEnough(s):
    s = list(s)
    for i in range(len(s)):
        for j in range(len(s)):
            if i != j:
                s[i], s[j] = s[j], s[i]
                ispali = True
                for k in range(len(s)):
                    if s[k] != s[len(s) - k - 1]:
                        ispali = False
                        break
                if ispali:
                    return True
                s[i], s[j] = s[j], s[i]
                
    return False
                
    

