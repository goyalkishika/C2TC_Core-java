package com.acharya.application;

public class answer4 {

	public abstract class ShopFactory {

		public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime);
		public abstract NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges,float deliveryCharges);
	}
