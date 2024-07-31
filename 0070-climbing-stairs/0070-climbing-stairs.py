class Solution:
    def climbStairs(self, n: int) -> int:
        if n==0:
            return 0
        elif n==1:
            return 1
        else:
            steps=[0]*(n+1)
            steps[0]=1
            steps[1]=1
            for i in range(2,n+1):
                steps[i]=steps[i-1]+steps[i-2]
            return steps[n]
        