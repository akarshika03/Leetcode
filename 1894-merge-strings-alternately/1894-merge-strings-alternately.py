class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        mini=min(len(word1),len(word2))
        s=[]
        for i in range(mini):
            s.append(word1[i])
            s.append(word2[i])
        s.append(word1[mini:])
        s.append(word2[mini:])
        return ''.join(s)

        