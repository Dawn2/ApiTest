package test;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Feeder.class)
// 指定运行器runner:使用参数化运行器来运行
public class ParametersTest
{
//    private int expected;// 期待的结果值
//
//    private int input1;// 参数1
//
//    private int input2;// 参数2

    private Calculator calculator = null;

    @Before
    public void setUp()
    {
        calculator = new Calculator();
    }

//    public ParametersTest(int input1,int input2,int expected)
//    {
//        // 构造方法
//        // JUnit会使用准备的测试数据传给构造函数
//        this.expected = expected;
//        this.input1 = input1;
//        this.input2 = input2;
//    }

    @Test
    @Source("Data.xlsx")
    public void testAdd_Excel(int input1,int input2,int expected)
    {
        assertEquals(expected,calculator.add(input1,input2));
    }

}


