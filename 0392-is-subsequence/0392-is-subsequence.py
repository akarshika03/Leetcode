class Solution:
    def isSubsequence(self, sub: str, tar: str) -> bool:
        c=0
        i,j=0,0
        while i<len(tar) and j<len(sub):
            if tar[i]==sub[j]:
                c+=1
                j+=1
            i+=1
        if len(sub)==c:
            return True
        return False
        