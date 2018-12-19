package pack;
public class tax {
	public double calcTax ( double d, double child,double proc)
	 {
		//переменная tax хранит результат вычисления
		double tax=0;
		//try отлавливает исключения
		try{
			//алгоритм расчета налога

				double ded=deduction(child);
				tax = (proc/100)*(d-ded);
				
			
		}
		//обработчик ошибок заносит -1 в tax в случае возникновения исключения
		catch(ArithmeticException exception){tax=-1;}
		return tax;
	 }
//метод deduction рассчитывает вычеты в зависимости от количества детей и состава семьи
	public double deduction(double child) {
		double ded=0;
		if(child<=2)
		{
			ded=(1400*child);
		}
		if(child>2) {
			ded = 2800 + (3000*(child-2));
		}
		return ded;
	}
}