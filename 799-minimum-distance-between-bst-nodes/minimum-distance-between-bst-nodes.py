# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.prev=None
        self.min_diff=10**5+1

    def fun(self,root):
        if root!=None:
            self.fun(root.left)

            if self.prev==None:
                self.prev=root
            else:
                self.min_diff=min(self.min_diff,root.val-self.prev.val)
                self.prev=root
            self.fun(root.right)
    def minDiffInBST(self, root: Optional[TreeNode]) -> int:
        self.fun(root)
        return self.min_diff