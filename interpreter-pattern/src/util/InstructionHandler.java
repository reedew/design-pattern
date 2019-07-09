package util;

import abs.AbstractNode;
import conc.*;

import java.util.Stack;

/**
 * 指令处理类
 */
public class InstructionHandler {
    private String instruction;
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null;
        AbstractNode right = null;
        AbstractNode direction = null;
        AbstractNode action = null;
        AbstractNode distance = null;
        // 声明一个栈用于存储抽象语法树
        Stack stack = new Stack();
        String[] words = instruction.split(" ");// 以空格分隔指令字符串
        for (int i = 0; i < words.length; i++) {
            if ("and".equals(words[i])) {
                left = (AbstractNode) stack.pop();// 栈顶元素作为左
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                // 压入之后类似一颗二叉树
                stack.push(new AndNode(left, right));// 将新表达式压入栈
            } else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left); //将新表达式压入栈中
            }
        }
        this.node = (AbstractNode) stack.pop();// 将全部表达式从栈中弹出
    }

    public String output() {
        return node.interpret();// 解释表达式
    }
}
