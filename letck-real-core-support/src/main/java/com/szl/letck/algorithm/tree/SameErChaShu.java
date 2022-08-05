package com.szl.letck.algorithm.tree;


/**
 * @ClassName SameErChaShu
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/2 16:08
 */
public class SameErChaShu {
    public static void main(String[] args) {

    }

    private boolean juageSame(TreeNode t1,TreeNode t2){
        boolean isSame = false;
        if(t1 == null && t2 == null){
            isSame = true;
        }

        if(t1 ==null || t2 != null){
            isSame = false;
        }

        boolean leftSame = juageSame(t1.left,t2.left);
        boolean rightSame = juageSame(t1.right,t2.right);

        if(t1.val == t2.val && leftSame && rightSame){
            isSame = true;
        }

        return isSame;
    }
}

class TreeNode {

    int val;

    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

}
