using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy
{
    class Calc
    {
        //Naming Convention
        //명명 규칙

        //자바 메소드(Method)

        //C# 메서드
        //MSDN(MicroSoft Developer Network) C# 공식 문서상에 번역된 내용이 메서드



        //자바 변수 선언 : int num = 0;
        //int tempNumber = 0;
        //메서드 선언 : public void hello()
        //public void helloHi()

        //C# 변수 선언 : var num = 0;
        //var tempNumber = 0;
        //메서드 선언 : public void Hello()
        //public void HelloHi()
        //접근제한자 반환타입 메서드이름(){}
        //public private ...
        public void PrintHello()
        {
            Console.WriteLine("안녕하세요.");
        }
        public void Hello1()
        {

        }

        private void Hello2()
        {

        }

        public int Plus(int num1, int num2)
        {
            return num1 + num2;
        }

    }
}
