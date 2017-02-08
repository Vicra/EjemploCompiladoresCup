package Tree;

public class BinaryOperatorNode {
    public ExpressionNode LeftOperand;
    public ExpressionNode RightOperand;

    public BinaryOperatorNode(ExpressionNode left, ExpressionNode right){
        LeftOperand = left;
        RightOperand = right;
    }
}