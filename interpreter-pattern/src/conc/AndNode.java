package conc;

import abs.AbstractNode;

/**
 * And解释
 */
public class AndNode extends AbstractNode {
    private AbstractNode left;// And的左表达式
    private AbstractNode right;// And的右表达式

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
