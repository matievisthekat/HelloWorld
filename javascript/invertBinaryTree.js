// assume node has .right and .left properties

function invertNode(node) {
    if (!node) return;

    const leftTmp = node.left;
    node.left = node.right;
    node.right = leftTmp;

    invertNode(node.left);
    invertNode(node.right);
}