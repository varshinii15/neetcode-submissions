class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s=""
        for i in digits:
            s+=str(i)
        n=int(s)
        l=[]
        n+=1
        s=str(n)
        for i in s:
            l.append(i)
        return l       