/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizi dizisinin bir matris olup olmadığını test eden isMatrix
	ve kare matris olup olmadığını test eden isSquareMatrix metotlarını MatrixUtil isimli sınıf içerisinde yazınız ve aşağıdaki
	kodlar ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Matrisin satır ve sutün sayısını giriniz:");
		int m = kb.nextInt();
		int n = kb.nextInt();

		int [][] a = MatrixUtil.getRandomMatrix(r, m, n, 0, 99);

		ArrayUtil.print(2, a);
	}
}
