using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FirstLibrary;

namespace CSharpStudy
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("안녕! C#");
            Console.Write("Hello, C#");

            //1 2 3 4 5 6 ... 10

            //var num = 1;

            //Generic List
            List<string> list = new List<string>();
            list.Add("text1");
            list.Add("text2");
            list.Add("text3");
            list.Add("text4");
            list.Add("text5");

            foreach (var text in list)
            {
                Console.WriteLine(text);
            }

            var listVar = new List<string>()
            {
                "text1",
                "text2",
                "text3",
                "text4",
                "text5"
            };

            foreach (var text in listVar)
            {
                Console.WriteLine(text);
            }

            Console.WriteLine("");
            Console.WriteLine("");

            //번호    이름   나이  연락처
            //01     김태웅  28    010-1234-1234
            //02     김해웅  27    010-9999-8888


            var user1 = new User()
            {
                No = 1,
                Name = "김태웅",
                Age = 28,
                Phone = "010-1234-1234"
            };

            //user1.No = 1;
            //user1.Name = "김태웅";

            var user2 = new User()
            {
                No = 2,
                Name = "김해웅",
                Age = 27,
                Phone = "010-8888-9999"
            };

            //user2.No = 2;
            //user2.Name = "김해웅";

            var listInfo = new List<User>()
            {
                user1, user2
            };

            //var listInfo = new List<User>();
            //listInfo.Add(user1);
            //listInfo.Add(user2);

            foreach (var user in listInfo)
            {
                Console.WriteLine("번호 : " + user.No + " / " + "이름 : " + user.Name + "/ 나이 : "+ user.Age + " / 연락처 : " + user.Phone );
            }

            Calc calc = new Calc();
            calc.PrintHello();
            Console.WriteLine(calc.Plus(10, 20));
            FirstClass first = new FirstClass();
            first.FirstClassPrint();

        }
    }
}
