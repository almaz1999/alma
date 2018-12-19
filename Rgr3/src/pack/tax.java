package pack;
public class tax {
	public double calcTax ( double d, double child,double proc)
	 {
		//���������� tax ������ ��������� ����������
		double tax=0;
		//try ����������� ����������
		try{
			//�������� ������� ������

				double ded=deduction(child);
				tax = (proc/100)*(d-ded);
				
			
		}
		//���������� ������ ������� -1 � tax � ������ ������������� ����������
		catch(ArithmeticException exception){tax=-1;}
		return tax;
	 }
//����� deduction ������������ ������ � ����������� �� ���������� ����� � ������� �����
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