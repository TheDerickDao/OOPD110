import io.*;
public class Combination extends AbstractCombination
{
private AbstractCombination code;
private int combo01, combo02, combo03;
public Combination()
	{
	combo01 = 10;
	combo02 = 11;
	combo03 = 12;
	}
public Combination( int inCombo01, int inCombo02, int inCombo03)
	{
	if	(combo01 >= 10 && combo01 <= 99)
		{
		combo01 = inCombo01;
		}
	else
		{
		combo01 = 10;
		}
	if (combo02 >= 10 && combo02 <= 99)
		{
		combo02 = inCombo02;
		}
	else
		{
		combo02 = 11;
		}
	if (combo03 >= 10 && combo03 <= 99)
		{
		combo03 = inCombo03;
		}
	else
		{
		combo03 = 12;
		}
	}
public Combination (Combination inCombination)
	{
	combo01 = inCombination.getCombo01();
	combo02 = inCombination.getCombo02();
	combo03 = inCombination.getCombo03();
	}
public int getCombo01()
	{
	return combo01;
	}
public int getCombo02()
	{
	return combo02;
	}
public int getCombo03()
	{
	return combo03;
	}
public void setCombo(int inCombo01, int inCombo02, int inCombo03)
	{
	combo01 = inCombo01;
	combo02 = inCombo02;
	combo03 = inCombo03;
	}
public String toString()
	{
	String outStr;
	outStr = new String("First Number: " + code.getCombo01() + "Second Number: " + code.getCombo02() + "Third Number: " + code.getCombo03());
	return outStr;
	}
}