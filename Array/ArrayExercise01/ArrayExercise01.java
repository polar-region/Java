public class ArrayExercise01{
        public static void main(String[] args){
                /*创建一个char类型的26个元素的数组
                 *利用for循环遍历元素并打印
                 *
                 *思路分析:
                 *1、定义数组 char[] chars = new char[26] 
                 *2、利用for循环进行赋值
                 */
                char[] chars = new char[26];
                //
                for(int i = 0;i<chars.length;i++){
                                chars[i] =(char)('A' + i);
                }
                System.out.println("==chars数组==");
                for(int i = 0;i<26;i++){
                        System.out.print(chars[i] + " " );
                }
        }
}

