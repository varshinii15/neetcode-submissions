class Solution:
    def isHappy(self, n: int,seen=None) -> bool:
        if seen is None:
            seen=set()
        s=str(n)
        a=0
        for i in s:
            a+=int(i)**2
        if a==1:
            return True
        elif a in seen:
            return False
        seen.add(a)
        return self.isHappy(a,seen)
        
            
            

        