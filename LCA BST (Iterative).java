// Time Complexity : O(log(n)); where n = number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else if(p.val < root.val && q.val < root.val){
                root = root.left;
            }
            else return root;
        }
    }
}