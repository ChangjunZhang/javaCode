package top.wordcount.java.datastruct.stack;

import org.junit.Test;

/**
 * //测试自定义栈类 ArrayStack
 * //创建容量为3的栈，然后添加4个元素，3个int，1个String.
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        //System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }


    /**
     * 　我们知道栈是后进先出，我们可以将一个字符串分隔为单个的字符，然后将字符一个一个push()进栈，在一个一个pop()出栈就是逆序显示了。如下：
     *
     * 　　将 字符串“how are you” 反转！！！
     *
     * 　　ps：这里我们是用上面自定的栈来实现的，大家可以将ArrayStack替换为JDK自带的栈类Stack试试
     */
    @Test
    public void testStringReversal(){
        ArrayStack stack = new ArrayStack();
        String str = "how are you";
        char[] cha = str.toCharArray();
        for(char c : cha){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    /**
     * 　写过xml标签或者html标签的，我们都知道<必须和最近的>进行匹配，[ 也必须和最近的 ] 进行匹配。
     *
     * 　　比如：<abc[123]abc>这是符号相匹配的，如果是 <abc[123>abc] 那就是不匹配的。
     *
     * 　　对于 12<a[b{c}]>，我们分析在栈中的数据：遇到匹配正确的就消除
     *
     *  //分隔符匹配
     *     //遇到左边分隔符了就push进栈，遇到右边分隔符了就pop出栈，看出栈的分隔符是否和这个有分隔符匹配
     */
    @Test
    public void testMatch(){
        ArrayStack stack = new ArrayStack(3);
        String str = "12<a[b{c}]>";
        char[] cha = str.toCharArray();
        for(char c : cha){
            switch (c) {
                case '{':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    if(!stack.isEmpty()){
                        char ch = stack.pop().toString().toCharArray()[0];
                        if(c=='}' && ch != '{'
                                || c==']' && ch != '['
                                || c==')' && ch != '('){
                            System.out.println("Error:"+ch+"-"+c);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }


}
