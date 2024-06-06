/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rootfind;

/**
 *
 * @author Abdulmajid Hassan
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root, ans);
        return ans;
    }

    private int level(TreeNode node, List<List<Integer>> ans) {
        if (node == null) {
            return -1;
        }

        int level = Math.max(level(node.left, ans), level(node.right, ans)) + 1;

        if (level >= ans.size()) {
            ans.add(new ArrayList<>());
        }

        ans.get(level).add(node.val);

        return level;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Find the leaves of the binary tree
        Solution solution = new Solution();
        List<List<Integer>> result = solution.findLeaves(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}



























