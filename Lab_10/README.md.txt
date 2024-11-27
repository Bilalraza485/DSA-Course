

```markdown
# LeetCode Binary Tree Problems

This repository contains solutions to various LeetCode problems related to binary trees. The problems cover concepts like tree symmetry, maximum depth, path sums, and tree inversion, and are implemented in Python.

## Table of Contents

- [Problem 1: Symmetric Tree](#problem-1-symmetric-tree)
- [Problem 2: Maximum Depth of Binary Tree](#problem-2-maximum-depth-of-binary-tree)
- [Problem 3: Path Sum](#problem-3-path-sum)
- [Problem 4: Invert Binary Tree](#problem-4-invert-binary-tree)
- [Problem 5: Path Sum II](#problem-5-path-sum-ii)

## Problem 1: Symmetric Tree
**LeetCode Problem:** [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/description/?envType=problem-list-v2&envId=tree)

### Problem Description:
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

### Solution:
The solution uses a recursive approach to check if the left subtree is a mirror of the right subtree.

### Explanation:
You can view the explanation of the solution [here](https://www.youtube.com/watch?v=Mao9uzxwvmc).

---

## Problem 2: Maximum Depth of Binary Tree
**LeetCode Problem:** [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=tree)

### Problem Description:
Given the root of a binary tree, return its maximum depth.

### Solution:
This problem can be solved by using a depth-first search (DFS) to calculate the height of the tree.

---

## Problem 3: Path Sum
**LeetCode Problem:** [Path Sum](https://leetcode.com/problems/path-sum/description/?envType=problem-list-v2&envId=tree)

### Problem Description:
Given a binary tree and a target sum, return true if there is a root-to-leaf path such that adding up all the values along the path equals the target sum.

### Solution:
This is solved by recursively traversing the tree and subtracting the node value from the target sum until a leaf is reached.

---

## Problem 4: Invert Binary Tree
**LeetCode Problem:** [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/?envType=problem-list-v2&envId=tree)

### Problem Description:
Invert a binary tree.

### Solution:
This problem is solved by swapping the left and right child nodes of each node in the tree recursively.

---

## Problem 5: Path Sum II
**LeetCode Problem:** [Path Sum II](https://leetcode.com/problems/path-sum-ii/description/?envType=problem-list-v2&envId=binary-tree)

### Problem Description:
Given the root of a binary tree and a target sum, return all root-to-leaf paths where each path’s sum equals the target sum.

### Solution:
A depth-first search (DFS) approach is used to find all paths that sum up to the target value.