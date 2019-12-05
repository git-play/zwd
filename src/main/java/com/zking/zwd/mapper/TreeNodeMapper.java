package com.zking.zwd.mapper;

import com.zking.zwd.model.TreeNode;

import java.util.List;

public interface TreeNodeMapper {

    List<TreeNode> listByParentNodeId(TreeNode treeNode);

}