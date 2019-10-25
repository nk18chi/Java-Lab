Trees have many fascinating properties. While this is primarily true for trees in nature, the concept of trees in math and computer science is also interesting. A particular kind of tree, a perfectly balanced tree, is defined as follows.
Every perfectly balanced tree has a positive integer weight. A perfectly balanced tree of weight 1 always consists of a single node. Otherwise, if the weight of a perfectly balanced tree is 𝑤 and 𝑤≥2, then the tree consists of a root node with branches to 𝑘 subtrees, such that 2≤𝑘≤𝑤. In this case, all 𝑘 subtrees must be completely identical, and be perfectly balanced themselves.
In particular, all 𝑘 subtrees must have the same weight. This common weight must be the maximum integer value such that the sum of the weights of all 𝑘 subtrees does not exceed 𝑤, the weight of the overall tree. For example, if a perfectly balanced tree of weight 8 has 3 subtrees, then each subtree would have weight 2, since 2+2+2=6≤8.
Given 𝑁, find the number of perfectly balanced trees with weight 𝑁.Trees have many fascinating properties. While this is primarily true for trees in nature, the concept of trees in math and computer science is also interesting. A particular kind of tree, a perfectly balanced tree, is defined as follows.
                                                                   
* Every perfectly balanced tree has a positive integer weight. A perfectly balanced tree of weight 1 always consists of a single node. Otherwise, if the weight of a perfectly balanced tree is 𝑤 and 𝑤≥2, then the tree consists of a root node with branches to 𝑘 subtrees, such that 2≤𝑘≤𝑤. In this case, all 𝑘 subtrees must be completely identical, and be perfectly balanced themselves.
* In particular, all 𝑘 subtrees must have the same weight. This common weight must be the maximum integer value such that the sum of the weights of all 𝑘 subtrees does not exceed 𝑤, the weight of the overall tree. For example, if a perfectly balanced tree of weight 8 has 3 subtrees, then each subtree would have weight 2, since 2+2+2=6≤8.                                                                 
* Given 𝑁, find the number of perfectly balanced trees with weight 𝑁.
 
# Input Specification

* The input will be a single line containing the integer 𝑁 (1≤𝑁≤109).
* For 5 of the 15 marks available, 𝑁≤1000.
* For an additional 2 of the 15 marks available, 𝑁≤50000.
* For an additional 2 of the 15 marks available, 𝑁≤106.

## Output Specification
Output a single integer, the number of perfectly balanced trees with weight 𝑁.

```
Sample Input 1
4
Sample Output 1
3
Explanation for Sample Output 1
One tree has a root with four subtrees of weight 1; a second tree has a root with two subtrees of weight 2; the third tree has a root with three subtrees of weight 1.
```

```
Sample Input 2
10
Sample Output 2
13
```